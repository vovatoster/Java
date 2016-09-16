package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr_Zaverukha on 9/16/2016.
 */
public class ModelTest {
    Model model = new Model();;
    int test = model.getSecretNumber();;
//    @Before
//    public void init() {
//        test = model.getSecretNumber();
//    }

    @Test
    public void testEffortEquals() throws Exception {
        model.effort(test);
        Assert.assertEquals(model.playing, false);

    }

    @Test
    public void testEffortLess() throws Exception {
        model.effort(test - 1);
        Assert.assertEquals(model.getBottom(), test - 1);
    }

    @Test
    public void testEffortMore() throws Exception {
        model.effort(test + 1);
        Assert.assertEquals(model.getTop(), test + 1);
    }

}