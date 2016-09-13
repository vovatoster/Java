package ua.epam;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr_Zaverukha on 9/13/2016.
 */
public class ArithmeticOperationTest {
    static ArithmeticOperation arithmeticOperation;
    @BeforeClass
    public static void createObject(){
        arithmeticOperation = new ArithmeticOperation();
    }



    @Test
    public void add() throws Exception {
        Assert.assertEquals(arithmeticOperation.add(5.0, 7.0), 13.0, 0);
    }
    @Test
    public void deduct() throws Exception {
        Assert.assertEquals(arithmeticOperation.deduct(10.0, 7.0), 3.0, 0);
    }

    @Test
    public void mult() throws Exception {
        Assert.assertEquals(arithmeticOperation.mult(3.0, 7.0), 21.0, 0);
    }

    @Test
    public void div() throws Exception {
        Assert.assertEquals(arithmeticOperation.div(10.0, 5.0), 2.0, 0);
    }

    @Test(expected=ArithmeticException.class)
    public void divWithException(){
        arithmeticOperation.div(5.0, 0.0);
    }


}