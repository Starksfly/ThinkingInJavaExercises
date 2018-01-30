package innerclasses;

public class E19 {
    class Inner1 {
        class Inner2 {
            void f() {}
        }
        Inner2 makeInner2() { return new Inner2(); }
    }
    Inner1 makeInner1() { return new Inner1(); }
    static class Nested1 {
        static class Nested2 {
            void f() {}
        }
        void f() {}
    }
    public static void main(String[] args) {
        new E19.Nested1().f();
        new E19.Nested1.Nested2().f();
        E19 x1 = new E19();
        E19.Inner1 x2 = x1.makeInner1();
        E19.Inner1.Inner2 x3 = x2.makeInner2();
        x3.f();
    }
}
