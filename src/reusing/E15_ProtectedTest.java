package reusing;

import reusing.protect.*;

public class E15_ProtectedTest {
    public static void main(String[] args) {
        new Derived().g();
    }

}

class Derived extends E15_Protected {
    public void g() {
        f();
    }
}
