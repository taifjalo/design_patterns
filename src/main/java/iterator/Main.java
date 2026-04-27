package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Sequence fib = new FibonacciSequence();
        
        Iterator<Integer> iter = fib.iterator();

        for (int i = 0; i <= 10; i++) {
            System.out.println(iter.next());
        }
    }
    
}
