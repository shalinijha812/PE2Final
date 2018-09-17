package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse input;

    @Before
    public void setUp() throws Exception {
         input=new Reverse();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void palindromeChecker() {
        //Arrange
        String expectedValue=("Yess it is a palindrome");
        //Act
        String result=input.palindromeChecker(12321);
        //Assert
        assertEquals(expectedValue,result);
    }
}