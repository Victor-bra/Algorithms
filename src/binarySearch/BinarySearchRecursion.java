package binarySearch;

public class BinarySearchRecursion {

    public static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public static int low = 0;
    public static int high = arr.length;

    public static void main(String[] args) {
        System.out.println(binarySearch(arr, 3));
    }

    public static int binarySearch(int[] arr, int key) {
        int middle = low + (high - low) / 2;

        if (key < arr[middle]) {
            high = middle - 1;
            return binarySearch(arr,key);
        } else if (key > arr[middle]) {
            low = middle + 1;
            return binarySearch(arr,key);
        } else{
            return middle;
        }
    }
}

