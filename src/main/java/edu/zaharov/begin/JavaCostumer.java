package edu.zaharov.begin;

public class JavaCostumer extends AbstractGroovyCostumer {

    @Override
    public void buy() {
        System.out.println("java shopping");
    }

    protected void sale(){
        System.out.println("java black friday");
    }
}
