package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency input;

    @Before
    public void setUp() throws Exception {
        input=new WordFrequency();
    }


    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getWordFrequency() {
        //Arrange
        int expectedValue=0;
        //Act
        int result=input.getWordFrequency(new File("/home/cgi/Exercise2/src/myexercise/Demo.txt"));
        //Assert
        assertEquals(expectedValue,result);
    }
}