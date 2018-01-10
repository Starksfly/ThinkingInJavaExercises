package access;

import access.local.E04_PackagedClass;

public class E04_ForeignClass extends E04_PackagedClass{  //the using of "protected" in extending
    public static void main(String[] args)
    {
        access.local.E04_PackagedClass.greeting();
    }
}
