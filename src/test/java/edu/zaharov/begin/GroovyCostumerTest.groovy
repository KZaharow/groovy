package edu.zaharov.begin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GroovyCostumerTest {

    @Test
    void testGroovyCostumer() {

        GroovyCostumer javaCostumer1, javaCostumer2;
        GroovyCostumer groovyCostumer1, groovyCostumer2

        javaCostumer1 = new GroovyCostumer();
        javaCostumer2 = new GroovyCostumer("Alex", 30);

        groovyCostumer1 = new GroovyCostumer(name: 'Alex', age: 30)
        groovyCostumer2 = ["Alex", 30] as GroovyCostumer

        Assertions.assertEquals(javaCostumer2, groovyCostumer1)
        Assertions.assertEquals(javaCostumer2, groovyCostumer2)
        //java init with params

    }
}
