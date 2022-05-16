package list

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class list {

    @Test
    @DisplayName("list initialization")
    void testListInit(){

        def arr = []
        println arr.getClass().getName();
    }
}
