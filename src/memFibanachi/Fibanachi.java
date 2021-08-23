package memFibanachi;

import java.util.Arrays;

//мемоизация
public class Fibanachi {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibanachi(n, mem));
    }

    private static long fibanachi(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];
        if (n == 0) return 0;
        if (n == 1) return 1;
        long result = fibanachi(n - 1, mem) + fibanachi(n - 2, mem);
        mem[n] = result;
        return result;
    }

}
