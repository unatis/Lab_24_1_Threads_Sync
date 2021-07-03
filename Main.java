package com.company;

public class Main {

    public static void main(String[] args) {

        //Prints Monkey or Cat first!!!

        Monkey monkey = new Monkey();
        //monkey.run();

        Cat cat = new Cat();
        //cat.run();

        Thread thread = new Thread(monkey);
        thread.start();

        Thread thread2 = new Thread(cat);
        thread2.start();

    }
}
