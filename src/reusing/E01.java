package reusing;

public class E01 {
    public static void main(String[] args) {
        Second second = new Second("Init String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second);
        second.setSimple("New String");
        System.out.println(second);
    }

}

class Simple
{
    String s;
    public Simple(String si) { s = si; }
    public String toString() { return s; }
    public void setString(String sNew) { s = sNew; }
}

class Second {
    Simple simple;
    String s;
    public Second(String si) {
        s = si;
    }
    public void check() {
        if(simple == null)
            System.out.println("not initialized");
        else
            System.out.println("initialized");
    }
    private Simple lazy() {
        if(simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }

    public Simple getSimple() {
        return lazy();
    }

    @Override
    public String toString() {
        return lazy().toString();
    }
    public void setSimple(String sNew) {
        lazy().setString(sNew);
    }
}
