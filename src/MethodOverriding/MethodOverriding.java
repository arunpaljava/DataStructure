package MethodOverriding;

class Parent {
    public void m1() {
        System.out.println("I am in m1 of parrent");
    }
}

public class MethodOverriding extends Parent {
    public void m1() {
        System.out.println("I am in m1 of child");
    }

    public void m2() {
        System.out.println("I am in m2 of child");
    }

    public static void main(String args[]) {
        Parent p = new MethodOverriding();
        // p.m2(); Compile time error
        p.m1();
    }
}
