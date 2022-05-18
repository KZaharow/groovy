package json

import edu.zaharov.begin.GroovyCostumer
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GroovyTestJson {

    @Test
    void testFromToJson() {
        def costumer = new GroovyCostumer(name: 'Den', age: 20)
        def json = JsonOutput.toJson(costumer)
        println json
        def customerFromJson = new JsonSlurper()
                .parse(json.getBytes())
                as GroovyCostumer
        Assertions.assertTrue(customerFromJson instanceof GroovyCostumer)
    }
}
