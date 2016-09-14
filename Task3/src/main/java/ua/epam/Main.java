package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] s = {1, 2, 4, 4, 4, 6, 7, 4, 6, 5, 3};
        int k = 4;
        int[] result = getInts(s, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getInts(int[] s, int k) {
        int j = 0;
        int[] res = new int[s.length];
        for (int i = 0; i < s.length; i++){
            if (s[i] == k){
                res[j] = i;
                j++;
            }
        }
        int [] result = new int[j];
        System.arraycopy(res, 0, result, 0, j);
        return result;
    }
}



