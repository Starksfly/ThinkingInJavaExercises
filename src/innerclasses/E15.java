package innerclasses;

class E15_A {
    private String data;
    public E15_A(String string) {
        this.data = string;
    }
    public void print() {
        System.out.println("E15_A.print()");
    }
}

class E15_B {
    private String data;
    E15_B(String data) {
        this.data = data;
    }
    public E15_A getA() {
        return new E15_A(data) {
            @Override
            public void print() {
                System.out.println("E15_B.print()");
            }
        };
    }
}

public class E15 {
    public static void main(String[] args) {
        E15_A a = new E15_B("E15_B").getA();
        a.print();
        E15_A b = new E15_A("E15_A");
        b.print();


    }
}
