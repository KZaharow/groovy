package edu.zaharov.begin

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@Canonical
@ToString
@EqualsAndHashCode
class GroovyCostumer extends JavaCostumer {

    String name
    int age

    @Override
    void buy() {
        print 'groovy shopping'
    }

    @Override
    protected void sale() {
        print('groovy black sale')
    }
}
