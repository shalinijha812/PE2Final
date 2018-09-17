package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable input;

    @Before
    public void setUp() throws Exception {
        input=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void display() {
        //arrange
        String expectedValue=("Puja"+" "+22+" "+20000.00);

        //Act
        String result=input.display();
        //Assert
        assertEquals(expectedValue,result);


    }
}