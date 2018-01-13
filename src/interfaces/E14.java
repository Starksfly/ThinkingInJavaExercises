package interfaces;

interface A {
    void printA1();
    void printA2();
}

interface B {
    void printB1();
    void printB2();
}

interface C {
    void printC1();
    void printC2();
}

interface D extends A, B, C {
    void printD();
}

class E {
    public void printE() {
        System.out.println("printE()");
    }
}

class F extends E implements D {
    public void printA1() { System.out.println("printA1"); }
    public void printA2() { System.out.println("printA2"); }
    public void printB1() { System.out.println("printB1"); }
    public void printB2() { System.out.println("printB2"); }
    public void printC1() { System.out.println("printC1"); }
    public void printC2() { System.out.println("printC2"); }
    public void printD() { System.out.println("printD"); }

}

public class E14 {
    static void takes1(A a) {
        a.printA1();
        a.printA2();
    }
    static void takes2(B b) {
        b.printB1();
        b.printB2();
    }
    static void takes3(C c) {
        c.printC1();
        c.printC2();
    }
    static void takes4(F f) {
        f.printA1();
        f.printA2();
        f.printB1();
        f.printB2();
        f.printC1();
        f.printC2();
        f.printD();
        f.printE();
    }
    public static void main(String[] args) {
        F f = new F();
        takes1(f);
        takes2(f);
        takes3(f);
        takes4(f);
    }
}
