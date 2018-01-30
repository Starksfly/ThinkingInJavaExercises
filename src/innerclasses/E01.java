package innerclasses;

class Outer {
    class Inner {}
    Inner getInner() {
        return new Inner();
    }
}

public class E01 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}
