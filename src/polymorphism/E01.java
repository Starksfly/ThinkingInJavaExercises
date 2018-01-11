package polymorphism;

class E01_A {
    public void print() {
        System.out.println("A");
    }
}

class E01_B extends E01_A {
    @Override
    public void print() {
        System.out.println("B");
    }
}

class E01_C extends E01_A {


}

public class E01 {
    public static void main(String[] args) {
        E01_A a = new E01_B();
        a.print();
        a = new E01_C();
        a.print();
    }


}
