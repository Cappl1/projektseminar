public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
        
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);
        
        System.out.println("Sorted arr1:");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nSorted arr2:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nSorted arr3:");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}

