package def

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class GroovyTestDef {

    @Test
    void testDev() {

        def x = 100
        assertEquals(Integer.class, x.getClass())
        x = "hello"
        assertEquals(String.class, x.getClass())
    }
}
