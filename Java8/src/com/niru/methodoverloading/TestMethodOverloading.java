package com.niru.methodoverloading;


public class TestMethodOverloading {
    public void display(){
        System.out.println("Display..!");
    }

    protected void display(Object obj){
        System.out.println("Object..!");
    }

    private void display(String str){
        System.out.println("String..!");
    }

    public static void main(String[] args) {
        TestMethodOverloading test = new TestMethodOverloading();
        test.display(10);
    }
}
