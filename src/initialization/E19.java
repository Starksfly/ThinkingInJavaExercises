package initialization;

public class E19 {
    static void printStrings(String... strs)
    {
        for (String s : strs)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        printStrings("These", "are", "some", "Strings");
        printStrings(new String[] {"These", "are", "some", "Strings"});
    }
}
