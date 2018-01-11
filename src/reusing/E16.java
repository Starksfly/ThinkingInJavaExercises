package reusing;

public class E16 {
    public static void main(String[] args) {
        Amphibian frog;
        frog = new Frog();
        frog.print();
    }

}

class Amphibian {
    public void print() { System.out.println("Amphibian"); }
}

class Frog extends Amphibian {
    public void print() { System.out.println("Frog");}

}
