package com.wzh.ist.help;

public class Text {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.name="zxxx";
        whoAreYou((Dog)a1);
        Animal a2 = new Cat();
        a2.name = "zz";
        whoAreYou((Cat)a2);
    }



    public static void whoAreYou(Dog dog){
        System.out.println("我叫"+dog.name);
    }

    public static void whoAreYou(Cat cat){
        System.out.println("我叫"+cat.name);
    }
}
