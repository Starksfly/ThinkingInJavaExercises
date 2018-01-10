package reusing;

public class E08 {
    public static void main(String[] args) {
        E08_B b = new E08_B("Manu");
        E08_B b2 = new E08_B();
    }
}

class E08_A {
    String s;
    E08_A(String s) {
        this.s = s;
        System.out.println("A.s =" + s);
    }
}

class E08_B extends E08_A{
    String s;
    E08_B(String s) {
        super("super." + s);
        this.s = s;
        System.out.println("B.s =" + s);
    }
    E08_B() {
        super("default");
        this.s = "default";
        System.out.println("B.s =" + s);
    }
}