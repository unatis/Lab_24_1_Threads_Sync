package com.company;

public class Cat extends Thread{

    @ Override
    public void run() {

        PrintCat();

    }

    public synchronized void PrintCat() {

        for(int i = 0; i < 100; i++){
            System.out.println("Cat");
        }

    }

}
