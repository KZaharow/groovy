package b_exceptions

import org.testng.annotations.Test

class GroovyTestException {

    @Test
    void testGroovyUncheckedException(){
        new File('doesNotExist.txt').text
    }
}
