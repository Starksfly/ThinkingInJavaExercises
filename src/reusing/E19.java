package reusing;

class E19_A {
    private final int i;
    E19_A() {
        i = 0;
    }
    public void print() {
        System.out.println("i =" + i);
    }

}
public class E19 {
    public static void main(String[] args) {
        E19_A a = new E19_A();
        a.print();
        E19_A b = new E19_A();
        b.print();
    }
}
