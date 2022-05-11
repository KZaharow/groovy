import org.junit.jupiter.api.Test

class GroovyTestRanges {

    @Test
    void groovyTestRanges() {

        def range
        range = 0..11
        range.each { println(it % 2 == 0 ? 'true' : 'false') }
    }

    @Test
    void groovyTestRangesLoop() {

        for (int i in 0..1000) {
            println 'hi'
        }
    }

    @Test
    void groovyTestRangesLoopWithStep() {

    }




}
