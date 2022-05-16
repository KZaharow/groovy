package loop

import org.junit.jupiter.api.Test

class GroovyLoopTest {

    private void prn(Closure closure) {
        closure.call()
        println()
    }

    @Test
    void testLoop() {

        for (int x = 0; x <= 3; x++) {
            //System.out.println(x);
            print x
        }
        println()

        for (int x in 0..10) {
            //System.out.println(x);
            print x
        }
        println()


        def listExamples = []

        def c = { 0.upto(4){print "$it "} }
        listExamples.add(c)
        listExamples << c

        listExamples << { 0.upto(4){print "$it "} }
        listExamples << { 5.times {print "$it "}}
        listExamples << { 0.step(7, 2) {print "$it "}}
        listExamples.forEach({ prn it })
    }
}