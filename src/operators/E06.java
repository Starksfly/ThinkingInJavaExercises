package operators;

public class E06 {
    static void compare (Dog dog1, Dog dog2)
    {
        System.out.println("dog1 == dog2 = " + (dog1 == dog2));
        System.out.println("dog1.equals(dog2) = " + dog1.equals(dog2));
        System.out.println("dog1.name == dog2.name =" + (dog1.name == dog2.name));
        System.out.println("dog1.name.equals(dog2.name) = " + dog1.name.equals(dog2.name));
        System.out.println("dog1.says == dog2.says =" + (dog1.says == dog2.says));
        System.out.println("dog1.says.equals(dog2.says) = " + dog1.says.equals(dog2.says));

    }

    public static void main (String[] args)
    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;
        dog1.name = "spot";
        dog1.says = "ruff!";
        dog2.name = "scruffy";
        dog2.says = "wurf!";

        System.out.println("compare dog1 and dog2");
        compare(dog1, dog2);
        System.out.println("compare dog1 and dog3");
        compare(dog1, dog3);
        System.out.println("compare dog2 and dog3");
        compare(dog2, dog3);
    }
}
