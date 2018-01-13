package interfaces;

import interfaces.ownpackage.*;

class ImplementInterface implements AnInterface {
    public void f() { System.out.println("ImplementInterface.f()"); }
    public void g() { System.out.println("ImplementInterface.g()"); }
    public void h() { System.out.println("ImplementInterface.h()"); }
}
public class E05 {
    public static void main(String[] args) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }

}
