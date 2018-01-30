package innerclasses;

interface E21_Interface {
    void print();
    class E21_InnerClass {
        static void call(E21_Interface e) {
            System.out.println("Calling E21.print");
            e.print();
        }
    }
}
public class E21 {
    public static void main(String[] args) {
        E21_Interface e = new E21_Interface() {
            @Override
            public void print() {
                System.out.println("E21");
            }
        };
        E21_Interface.E21_InnerClass.call(e);
    }
}
