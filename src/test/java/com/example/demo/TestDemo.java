package com.example.demo;


public class TestDemo {

    public static void main(String[] args) {

        MyObject mc = new MyObject();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 26; i++){
                    mc.printNum();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 26; i++){
                    mc.printA();
                }
            }
        }).start();

    }

}
