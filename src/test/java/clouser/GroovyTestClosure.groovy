package clouser

import edu.zaharov.begin.GroovyCostumer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GroovyTestClosure {

    static ArrayList<GroovyCostumer> arr

    @BeforeEach
    void init() {
        arr = []
        arr << new GroovyCostumer(name: 'Tom', age: 30)
        arr << new GroovyCostumer(name: 'Jhon', age: 20)
        arr << new GroovyCostumer(name: 'Kate', age: 28)
        arr << new GroovyCostumer(name: 'Sue', age: 25)
    }

    @Test
    void groovyTestClosureCommon() {

        def closureWithOneArg = { str -> str.toUpperCase() }
        assert closureWithOneArg('groovy') == 'GROOVY'

        def greeting = { "Hello, $it!" }
        assert greeting('Tom') == 'Hello, Tom!'

    }


    @Test
    void testGroovyClosure1() {

        def costumer = new GroovyCostumer(name: 'Sue', age: 25)
        costumer.each { it -> println(it) }
    }

    //call it, getter & setter
    @Test
    void testGroovyClosure2() {

        arr.each { println it }
        arr.each { println it.age }
        arr.each { println it.@age = 2 }
    }

    /* {
         item++
     }

     {
         -> item++
     }

     {
         println it
     }

     {
         it -> println it
     }

     {
         name -> println name
     }

     {
         String x,
         int y
         ->
         println "hey ${x} the value is ${y}"
     }

     {
         reader ->
         def line = reader.readLine()
         line.trim()
     }

 */
}
