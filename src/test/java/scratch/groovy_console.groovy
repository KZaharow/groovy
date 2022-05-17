package scratch

import groovy.json.JsonSlurper
import groovy.transform.ToString
import wslite.rest.RESTClient

def rates = []
def args = args ?: []
def city = args[0] ?: 'Гомель'
def currency = args[1] ?: 'PLN'
def url = "https://belarusbank.by/api/kursExchange?city=${city}"
println "currency is ${currency} city is ${city}"

def d = new L()
d.startDaemon {
    while (1) {
        print '*'
        sleep(100)
    }r
}
def response = new RESTClient(url).get()
d.stop()
println "status ${response.statusCode}, ${response.statusMessage}"
if (response.getStatusCode() != 200) System.exit()
def json = new JsonSlurper().parse(response.getData()) as List<HashMap<String, Object>>
json.forEach({
    println it
    rates << new BankData(
            buy: it."${currency}_in",
            sale: it."${currency}_out",
            address: it.'street' + ',' + it.'home_number')
})
println "bank buy = ${rates.min() { it.buy }}"
println "bank sale = ${rates.max() { it.sale }}"


@ToString
class BankData {
    def buy
    def sale
    def address
}

class L extends Thread {}
