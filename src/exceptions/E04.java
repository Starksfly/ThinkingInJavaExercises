package exceptions;

class MyException extends Exception {
    String msg;
    public MyException(String msg) {
        this.msg = msg;
    }
    public void printMsg() {
        System.out.println("msg = " + msg);
    }
}

class MyException2 extends Exception {
    public MyException2(String s) { super(s); }
}

public class E04 {
    public static void main(String[] args) {
        try {
            throw new MyException("MyException message");
        } catch (MyException e) {
            e.printMsg();
        }
        try {
            throw new MyException2("MyException2 message");
        } catch (MyException2 e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
