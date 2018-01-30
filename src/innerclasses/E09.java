package innerclasses;

interface E09Interface {
    public void print();
}

public class E09 {
    public E09Interface get() {
        class E09InnerClass implements E09Interface {
            public void print() {
                System.out.println("print()");
            }
        }
        return new E09InnerClass();
    }
    public static void main(String[] args) {
        E09Interface a = new E09().get();
        a.print();
    }
}
