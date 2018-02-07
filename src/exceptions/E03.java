package exceptions;

public class E03 {
    public static void main(String[] args) {
        String[] strings = "Hello the World".split(" ");
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(strings[i]);

            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);

        }
    }

}
