package se.kth.iv1350.seminar4.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegisterTest {
    private Register instance;

    @Before
    public void setUp(){
        instance = Register.getInstance();
    }

    @After
    public void tearDown(){
        instance = null;
    }


    @Test
    public void testUpdateAmount()
    {
        double testAmount = 50;
        double amountBefore = instance.getAmount();
        instance.updateAmount(testAmount);

        assertEquals(
            "UpdateAmount did not give the expected result", 
            (amountBefore + testAmount), 
            instance.getAmount(), 
            0.01
        );
    }
}
