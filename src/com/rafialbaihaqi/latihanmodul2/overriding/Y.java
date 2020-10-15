package com.rafialbaihaqi.latihanmodul2.overriding;

public class Y extends X {
    public void getValue(String value){
        super.getValue(value);
        System.out.println("Value Y\t: " + value);
    }
}
