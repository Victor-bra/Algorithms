package greedyAlgorithms;

//Жадный алгоритм
    /*Дан неупорядоченный список цифр от 0 до 9.
    Составить из этих цифр наибольшее число.*/


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorted {
    public static void main(String[] args) {
        int[] digits = {3,1,7,9,9,5};
        System.out.println(maxNumberFromDigits(digits));
    }

    public static String maxNumberFromDigits(int[] digits){
        /*Arrays.sort(digits);

        String result = "";

        for(int i=digits.length-1;i>=0;i--)
            result+=digits[i];
        return result;*/
        return String.join("", Arrays.stream(digits).boxed().
                sorted(Collections.reverseOrder()).map(String::valueOf).
                toArray(String[]::new));
    }
}
