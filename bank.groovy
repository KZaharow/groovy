import groovy.json.JsonSlurper
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import wslite.rest.RESTClient

def rates = []
def args = args ?: []
def city = args[0] ?: 'Минск'
def currency = args[1] ?: 'RUB'
def url = "https://belarusbank.by/api/kursExchange?city=${city}"
println "${new Date()} поиск ${currency} в ${city} ...."
def response = new RESTClient(url).get()
if (response.getStatusCode() != 200) System.exit()
def json = new JsonSlurper().parse(response.getData()) as List<HashMap<String, Object>>
json.forEach({
    rates << new BankData(buy: it."${currency}_in", sale: it."${currency}_out", address: it.'street' + ',' + it.'home_number')
})
println "\nПОКУПАТЬ ${currency} ТУТ ${rates.min() { it.buy }}"
println "СДАВАТЬ  ${currency} ТУТ ${rates.max() { it.sale }}"

class BankData {
    def buy, sale, address

    String toString() { "АДРЕС=${address} ПОКУПКА=${buy}, ПРОДАЖА=${sale}" }
}