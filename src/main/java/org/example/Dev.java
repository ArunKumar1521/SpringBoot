package org.example;

public class Dev {
    private laptop laptop;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) {
        this.age = age;
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public org.example.laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(org.example.laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("working on a project");
        laptop.compile();
    }
}
