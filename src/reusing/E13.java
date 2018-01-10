package reusing;

public class E13 {
    public static void main(String[] args) {
        E13_B b = new E13_B();
        b.print('b');
        b.print("abc");
        b.print(13);
        b.print(13.5);
    }

}

class E13_A {
    public void print(int a) { System.out.println(a); }
    public void print(double a) { System.out.println(a); }
    public void print(String a) { System.out.println(a); }

}

class E13_B extends E13_A {
    public void print(char a) { System.out.println(a); }
}
