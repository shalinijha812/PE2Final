package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades input;
    int[] arrayOfNumbers = {10,80,90};
    int size = arrayOfNumbers.length;

    @Before
    public void setUp() throws Exception {
        input=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }
    @Test
    public void checkValidInputTest(){
        //Arrange
    int expectedValue=0;
    //Act
    int result= (int) input.checkForValidInput(arrayOfNumbers,size);
    //Assert
        assertEquals(expectedValue,result);

    }

    @Test
    public void avgOfAll() {
        //Arrange
        float expectedValue=60;
        //Act
        float result=input.avgOfAll(arrayOfNumbers, size);
        //Assert
        assertEquals(expectedValue,result,0.1);
    }

    @Test
    public void minOfAll() {
        //Arrange
        int expectedValue=10;
        //Act
        int result=input.minOfAll(arrayOfNumbers, size);
        //Assert
        assertEquals(expectedValue,result);
    }

    @Test
    public void maxOfAll() {
        //Arrange
        int expectedValue=90;
        //Act
        int result=input.maxOfAll(arrayOfNumbers, size);
        //Assert
        assertEquals(expectedValue,result);
    }
}