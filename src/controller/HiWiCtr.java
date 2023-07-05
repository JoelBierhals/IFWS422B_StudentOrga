package controller;

import model.HiWi;

public class HiWiCtr {
    public static void main(String[] args) {
        HiWi hiwi = new HiWi("Joel", 1, 1000.0, 3);

        System.out.println(hiwi.toString());
    }
}
