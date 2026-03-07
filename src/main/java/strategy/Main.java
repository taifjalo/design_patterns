package strategy;

import java.util.Random;

public class Main {

    public static int[] generateArray(int size) {

        Random rand = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100000);
        }

        return array;
    }

    // Function to test sorting time
    public static void testSort(SortContext context, int[] array, String name) {

        int[] copy = array.clone();

        long start = System.nanoTime();

        context.sortArray(copy);

        long end = System.nanoTime();

        System.out.println(name + " time: " + (end - start));
    }


     
// Create datasets
     public static void main(String[] args) {

        int[] smallArray = generateArray(30);
        int[] largeArray = generateArray(100000);

        SortContext context = new SortContext(new BubbleSort());

        System.out.println("Small Array:");

        testSort(context, smallArray, "BubbleSort");

        context.setSortingStrategy(new MergeSort());
        testSort(context, smallArray, "MergeSort");

        context.setSortingStrategy(new QuickSort());
        testSort(context, smallArray, "QuickSort");

        System.out.println("\nLarge Array:");

        context.setSortingStrategy(new BubbleSort());
        testSort(context, largeArray, "BubbleSort");

        context.setSortingStrategy(new MergeSort());
        testSort(context, largeArray, "MergeSort");

        context.setSortingStrategy(new QuickSort());
        testSort(context, largeArray, "QuickSort");
    }
}