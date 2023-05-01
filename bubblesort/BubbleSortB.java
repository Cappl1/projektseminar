public class BubbleSortB {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    // swap arr[j] and arr[j+1]
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        String[] arr2 = {"foo", "bar", "baz", "qux"};
        Double[] arr3 = {5.6, 3.2, 1.8, 4.1, 2.9};
        
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);
        
        System.out.println("Sorted arr1:");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nSorted arr2:");
        for (String s : arr2) {
            System.out.print(s + " ");
        }
        
        System.out.println("\nSorted arr3:");
        for (double d : arr3) {
            System.out.print(d + " ");
        }
    }
}