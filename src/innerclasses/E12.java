package innerclasses;

public class E12 {
    private int i = 10;
    private void f() {
        System.out.println("E12.f");
    }
    public void h() {
        new Object() {
            void g() {
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }
    public static void main(String args[]) {
        E12 ica = new E12();
        ica.h();
    }
}
