package innerclasses.e6package2;

import innerclasses.e6package1.E6interface;


public class E6class {
    private String data;
    protected class E6_innerclass implements E6interface {
        public E6_innerclass() {}
        public void print() {
            System.out.println(data);
        }
        void print2() {
            System.out.println("2");
        }
    }
    public E6class(String data) {
        this.data = data;
    }
}
