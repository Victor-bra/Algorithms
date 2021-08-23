package fibanachi;

public class Fibanachi {
    public static void main(String[] args) {
        System.out.println(fibanachi2(100));
//        System.out.println(fibanachi(50)); //очень долгое вычисление
    }

    //slow
    private static long fibanachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibanachi(n - 1) + fibanachi(n - 2);
    }

    //fast
    private static long fibanachi2(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
