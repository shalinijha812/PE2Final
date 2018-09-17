package myexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileReadExtenTest {
    FileReadExten input;

    @Before
    public void setUp() throws Exception {
        input=new FileReadExten();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void readFilesByte() {
        //Arrange
        int expectedValue=0;
        //Act
        int result=input.readFilesByte(new File("/home/cgi/learnings/text.txt"));
        //Assert
        assertEquals(expectedValue,result);
    }
}