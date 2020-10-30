package com.wzh.ist.help;

public class Dog extends Animal{
    @Override
    protected void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    protected void speak() {
        System.out.println("汪汪");
    }
}
