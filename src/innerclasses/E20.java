package innerclasses;

interface E20_Inteface {
    void print();
    class E20_InnerClass implements E20_Inteface {
        public void print() {
            System.out.println("E20_InnerClass_Interface");
        }
    }
}

public class E20 {
    public static void main(String[] args) {
        E20_Inteface.E20_InnerClass a = new E20_Inteface.E20_InnerClass();
        a.print();
    }
}
