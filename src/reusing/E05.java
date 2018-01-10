package reusing;

public class E05 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    private String s = "I am A";
    A() {
        System.out.println("Creating an A");
    }
}

class B {
    private String s = "I am B";
    B() {
        System.out.println("Creating a B");
    }
}

class C extends A {
    public B b = new B();

}
