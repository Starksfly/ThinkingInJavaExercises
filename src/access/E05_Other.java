package access;

import access.local.E05_AccessControl;

public class E05_Other {
    public E05_Other()
    {
        E05_AccessControl test = new E05_AccessControl();
        test.a = 1;
        //!test.b = 2;
        //!test.c = 3;
        //!test.d = 4;
        test.f1();
        //!test.f2();
        //!test.f3();
        //!test.f4();
    }
}
