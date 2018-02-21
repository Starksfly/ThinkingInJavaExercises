package exceptions;

import com.sun.corba.se.pept.transport.Selector;

class SequenceFullException extends RuntimeException {}

class Sequence2 {
    private Object[] objects;
    private int next;
    public Sequence2(int size) { objects = new Object[size]; }
    public void add(Object x) {
        if (next < objects.length)
            objects[next++] = x;
        else
            throw new SequenceFullException();
    }
    /*private class SequenceSelector implements Selector {
        private int i;
        public boolean end() { return i == objects.length; }
        public Object current() { return objects[i]; }
        public void next() { if (i < objects.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    */
}

public class E12 {
}
