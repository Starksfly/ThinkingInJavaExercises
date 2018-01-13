package interfaces;

abstract class NoMethods {}

class Extended1 extends NoMethods{
    public void print() {
        System.out.println("Extended1.print()");
    }
}

abstract class WithMethods {
    abstract public void print();
}

class Extended2 extends WithMethods {
    public void print() {
        System.out.println("Extended2.print()");
    }
}
public class E04 {
    public static void test1(NoMethods nm) {
        ((Extended1) nm).print();
    }
    public static void test2(WithMethods wm) {
        wm.print();
    }
    public static void main(String[] args) {
        NoMethods nm = new Extended1();
        test1(nm);
        WithMethods wm = new Extended2();
        test2(wm);
    }
}
