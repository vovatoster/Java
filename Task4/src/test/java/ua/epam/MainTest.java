package ua.epam;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr_Zaverukha on 9/14/2016.
 */
public class MainTest {

    private void getInsTest(int[]s, int k, int [] res){
        int[] tmp = Main.getInts(s, k);
        Assert.assertArrayEquals(tmp, res);
    }
    @Test
    public void test1(){
        int [] s = {1, 2, 4, 4, 4, 6, 7, 4, 6, 5, 3};
        int k = 4;
        int []res = {2, 3, 4, 7};
        getInsTest(s, k, res);
    }

    @Test
    public void test2(){
        int [] s = {};
        int k = 4;
        int []res = {};
        getInsTest(s, k, res);
    }

    @Test
    public void test3(){
        int [] s = {1, 2, 4, 4, 4, 6, 7, 4, 6, 5, 3};
        int k = 8;
        int []res = {};
        getInsTest(s, k, res);
    }

    @Test
    public void test4(){
        int [] s = new int[1];
        int k = 0;
        int []res = {0};
        getInsTest(s, k, res);
    }

}