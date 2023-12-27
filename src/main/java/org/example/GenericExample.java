package org.example;

public class GenericExample <T>{
    T value;
    public GenericExample(T value){
        this.value = value;
    }
    public void print(){
        System.out.println(value);
    }
}
