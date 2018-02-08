package exceptions;

class AnException2 extends Exception {}


public class E11 {
    public void g() throws AnException2 {
        throw new AnException2();
    }
    public void f() throws AnotherException {
        try {
            g();
        } catch (AnException2 e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        E11 ce = new E11();
        try {
            ce.f();
        } catch (AnotherException e) {
            System.out.println("Caught1 " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught2 " + e);
        }
    }
}
