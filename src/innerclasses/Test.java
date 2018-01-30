package innerclasses;

interface TestInterface {
    public void print();
}

class Apply {
    public static void use(TestInterface t) {
        t.print();

    }
}

class TestClass implements TestInterface {
    public void print() {
        System.out.println("print()");
    }
}
public class Test {
    public static void main(String[] args) {
        TestInterface a = new TestClass();
        Apply.use(a);
    }

}
