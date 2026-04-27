package iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    
    // Class and Method to return the values from FibonacciIterator() Class, where the logic is.
    @Override
    public Iterator<Integer> iterator() {
            return new FibonacciIterator();
    }
}
