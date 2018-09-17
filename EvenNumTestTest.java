package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest input;

    @Before
    public void setUp() throws Exception {
        input=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void isEven() {
        //Arrange
        boolean expectedValue=true;
        //Act
        boolean result=input.isEven(66);
        //Assert
        assertEquals(expectedValue,result);
    }
}