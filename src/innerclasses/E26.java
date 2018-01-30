package innerclasses;

class E26_Class {
    class E26_InnerClass1 {
        private String data;
        E26_InnerClass1(String string) {
            data = string;
            System.out.println("E26_InnerClass data:" + data);
        }
    }
}

public class E26 extends E26_Class.E26_InnerClass1 {
        E26(E26_Class c) {
            c.super("Hello");
        }

    public static void main(String[] args) {
        E26_Class ec = new E26_Class();
        E26 ei2 = new E26(ec);
    }
}
