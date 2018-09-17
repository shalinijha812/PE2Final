package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour input;

    @Before
    public void setUp() throws Exception {
        input=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void powerOfFourChecker() {
        //Arrange
        String expectedValue="Yess,it is a power of 4";
        //Act
        String result=input.powerOfFourChecker(16);
        //Assert
        assertEquals(expectedValue,result);
    }
}