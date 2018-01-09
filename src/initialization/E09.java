package initialization;

public class E09 {

    public static void main(String[] args)
    {
        Flower flower = new Flower();
        flower.printPetalCount();
        Flower x = new Flower("new flower", 100);
    }
}

class Flower
{
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals)
    {
        petalCount = petals;
        System.out.println("Flower(int) = " + petals );
    }
    Flower(String s)
    {
        this.s = s;
        System.out.println("Flower(String = " + s);

    }
    Flower(String s, int petalCount)
    {
        this(petalCount);
        this.s = s;
        System.out.println("Flower(String, int) = " + s + "," + petalCount);
    }
    Flower()
    {
        this("default", 47);
        System.out.println("Flower()");
    }
    void printPetalCount()
    {
        System.out.println("petalCount = " + petalCount + ", s = " + s);
    }

}
