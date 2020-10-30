package com.wzh.ist.help;

public class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    protected void speak() {
        System.out.println("喵喵");
    }
}
