package exceptions;

public class E13 {
    public static void throwNull() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        Thrower2 t = new Thrower2();
        try {
            t.f();
        } catch (ExBase e) {
            System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause A");
        }
        try {
            throwNull();
            t.f();
        } catch (ExBase e) {
            System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause B");
        }
    }
}
