package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},3));
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if(key<arr[middle]){
                high=middle-1;
            } else if(key>arr[middle]){
                low=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
