package org.example;

public class Main {
    public static void main(String[] args) {
        GenericExample<String> obj = new GenericExample<String>("Hello");
        GenericExample<Integer> obj1 = new GenericExample<>(123);
        obj.print();
        obj1.print();

    }
}