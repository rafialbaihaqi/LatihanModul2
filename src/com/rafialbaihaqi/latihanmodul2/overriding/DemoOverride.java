package com.rafialbaihaqi.latihanmodul2.overriding;

public class DemoOverride {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass = new Y();

        superclass.getValue("Mati listrik");
        subclass.getValue("Mati lampu");
    }
}
