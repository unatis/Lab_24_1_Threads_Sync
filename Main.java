package com.company;

public class Main {

    public static void main(String[] args) {

        //Prints Monkey or Cat first!!!

       Monkey monkey = new Monkey();
        //monkey.PrintMonkey();

        Cat cat = new Cat();
        //cat.PrintCat();

        Thread thread = new Thread(monkey);
        thread.start();

        Thread thread_2 = new Thread(cat);
        thread_2.start();
    }
}
