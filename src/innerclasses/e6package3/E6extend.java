package innerclasses.e6package3;

import innerclasses.e6package1.E6interface;
import innerclasses.e6package2.E6class;

public class E6extend extends E6class {
    public E6extend() {
        super("data");
    }
    public E6interface get() { return new E6_innerclass(); }
    public static void main(String[] args) {
        new E6extend().get().print();
    }
}
