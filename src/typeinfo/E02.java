package typeinfo;

import static net.mindview.util.Print.*;

interface HasCPU {}

class FancierToy extends FancyToy implements HasCPU {}

public class E02 {
    static void printInfo(Class<?> cc) {
        print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class<?> c = null;
        try {

        }
    }
}
