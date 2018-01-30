package innerclasses;

interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int wheels() {
        return 1;
    }
    public static CycleFactory factory = new CycleFactory() {
        public Unicycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    @Override
    public int wheels() {
        return 2;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Bicycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    public int wheels() {
        return 3;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Tricycle getCycle() {
            return new Tricycle();
        }
    };
}

public class E16 {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }
}
