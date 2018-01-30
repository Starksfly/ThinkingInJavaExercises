package innerclasses;

class E02_A {
    private String data;
    E02_A(String data) {
        this.data = data;
    }
    public String toString() {
        return data;
    }
}

public class E02 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new E02_A(Integer.toString(i)));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
