package reusing;

public class E07 {
    public static void main(String[] args) {
        E07_C c = new E07_C("Creating a new c which will be send upward");
    }
}

class E07_A {
    private String s = "I am A";
    E07_A(String s) {
        this.s = s;
        System.out.println("Creating an A" + "; s =" + s );
    }
}

class E07_B {
    private String s = "I am B";
    E07_B(String s) {
        this.s = s;
        System.out.println("Creating a B" + "; s =" + s);
    }
}

class E07_C extends E07_A {
    public E07_B b = new E07_B("In C Creating a new B");
    E07_C(String s) {
        super(s);
        System.out.println("In C creating a new c");
    }

}
