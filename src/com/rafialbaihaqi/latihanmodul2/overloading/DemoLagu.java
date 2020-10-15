package com.rafialbaihaqi.latihanmodul2.overloading;

public class DemoLagu {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Without You", "G-Dragon");
        Lagu lagu2 = new Lagu("Runaway", "Eric Nam");

        lagu1.getDataLagu();
        System.out.println();
        lagu2.getDataLagu();
    }
}
