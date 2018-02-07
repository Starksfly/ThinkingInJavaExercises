package exceptions;

class Thrower {
    public void f() {
        //throw new MyException("a exception");
    }
    public void g() throws MyException {
        throw new MyException("Inside f()");
    }
}

public class E08 {
    public static void main(String[] args) {
        Thrower t = new Thrower();
        try {
            t.g();
        } catch (MyException e) {
            e.printMsg();
        }
    }
}
