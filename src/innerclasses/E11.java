package innerclasses;

public class E11 {
    private class E11InnerClass implements E11Interface {
        public void print() {
            System.out.println("InnerClass.print()");
        }
    }
    E11Interface get1() {
        return new E11InnerClass();
    }
    E11InnerClass get2() {
        return new E11InnerClass();
    }
    public static void main(String[] args) {
        E11 a = new E11();
        E11Interface b = a.get1();
        //!E11InnerClass c = a.get1();
        E11InnerClass d = a.get2();
        E11InnerClass e = a.get2();
    }
}
