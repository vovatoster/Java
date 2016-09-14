package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] getInts(int[] s, int k) {
        int[] res = new int[s.length];
        int j = 0;
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



