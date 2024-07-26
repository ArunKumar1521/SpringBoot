package org.example;

public class laptop implements Computer {
    public laptop(){
        System.out.println("laptop constructor");
    }

    public void compile(){
        System.out.println("Compiling in a laptop");
    }
}
