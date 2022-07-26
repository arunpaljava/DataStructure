class A {
    public void m1(Object s){
        System.out.println("Obj");
    }
}
public class B extends A{
    public void m1(String s){
        System.out.println("String");
    }

    public static void main(String s[]){
        A a = new B();
        a.m1(null);
    }
}
