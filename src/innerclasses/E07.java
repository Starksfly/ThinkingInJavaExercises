package innerclasses;

public class E07 {
    private String data = "data";
    private void print() {
        System.out.println(data);
    }
    class InnerClass {
        String string = "inner";
        void change() {
            data = "changed";
            print();
        }
    }
    public void doSomething() {
        InnerClass i = new InnerClass();
        i.change();
    }
    public static void main(String[] args) {
        E07 a = new E07();
        a.print();
        a.doSomething();
        a.print();
    }
}
