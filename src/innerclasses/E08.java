package innerclasses;

public class E08 {
    private String data = "data";
    private void print(String astring) {
        System.out.println(astring);
    }
    class InnerClass2 {
        String string = "inner";
        void change() {
            data = "changed";
        }
    }
    public void doSomething() {
        InnerClass2 i = new InnerClass2();
        i.change();
    }
    public static void main(String[] args) {
        E08 a = new E08();
        E08.InnerClass2 b = a.new InnerClass2();
        a.print(a.data);
        a.doSomething();
        a.print(b.string);
    }
}
