package string

import org.junit.jupiter.api.Test

class TestString {

    final static String STRING_A = "HELLO GROOVY "
    final static String STRING_B = "WORLD"

    @Test
    void testOperationsWithString(){
        println STRING_A.plus(STRING_B)
        println STRING_A.minus(STRING_B)
        println STRING_A.multiply(2)

    }
}
