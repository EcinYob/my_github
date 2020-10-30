package com.wzh.ist.everyday;

public class Lazy extends Nanny{

    public Lazy(String name, int age){
        this.name=name;
        this.age = age;
    }
    @Override
    public void cook() {
        System.out.println("做个屁，饿死吧");
    }

    @Override
    public void washClothes() {
        System.out.println("洗个屁,别穿了");
    }
}
