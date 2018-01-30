package innerclasses;

public class E13 {
    public E13_interface get() {
        return new E13_interface() {
            @Override
            public void print() {
                System.out.println("E13_interface.print()");
            }
        };
    }
    public static void main(String args[]) {
        E13_interface si = new E13().get();
        si.print();
    }
}
