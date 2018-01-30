package innerclasses;

interface U {
    void method1();
    void method2();
    void method3();

}

class E23_A {
    static U methodA1() {
        U a = new U() {
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };
        return a;
    }

}
class E23_B {
    private U[] us;
    private int next;
    public E23_B(E23_A[] a) {
        us = new U[a.length];
    }

    void add(U u) {
        if (next < us.length)
            us[next++] = u;
    }

    void setNull(int i) {
        while (i >= us.length)
            us[i++] = null;
    }

    void doingsth() {
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) break;
            System.out.println("i = " + i);
            us[i].method1();
            us[i].method2();
            us[i].method3();
        }

    }
}

public class E23 {
    public static void main(String[] args) {
        E23_A[] a = new E23_A[10];
        E23_B b = new E23_B(a);
        for (int i =0; i < a.length; i++) {
            b.add(a[i].methodA1());
        }
        b.doingsth();
        System.out.println("*****");
        b.setNull(3);
        b.doingsth();
    }


}