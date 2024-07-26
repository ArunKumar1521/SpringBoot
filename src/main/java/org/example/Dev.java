package org.example;

public class Dev {
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public void build(){
        System.out.println("working on a project");
        com.compile();
    }
}
