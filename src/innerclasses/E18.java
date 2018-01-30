package innerclasses;

public class E18 {
    private static class E18_innerclass {
        String name = "Hello";
        void print() {
            System.out.println(name);
        }
    }
    public E18_innerclass getInnerclass() {
        return new E18_innerclass();
    }
    public static void main(String[] args) {
        E18 a = new E18();
        E18_innerclass b = a.getInnerclass();
        b.print();
    }
}
