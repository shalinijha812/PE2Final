package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReadFromFileTest {
    ReadFromFile input;

    @Before
    public void setUp() throws Exception {
        input=new ReadFromFile();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheLengthOfFile() {
        //Arrange
        long expectedValue = 64;
        //Act
        long result = input.getTheLengthOfFile(new File("/home/cgi/Desktop/text.txt"));
        //Assert
        assertEquals(expectedValue, result);
    }

}