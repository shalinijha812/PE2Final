package myexercise;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
    File file=new File("/home/cgi/Desktop/text.txt");
    BufferedReader br=new BufferedReader(new FileReader(file));

    public ReadFromFile() throws FileNotFoundException {
	System.out.print("File Not Found");
    }


    public void changeToUppercase() throws IOException {
        String st;
        while((st=br.readLine())!=null)
        {
            st=st.toUpperCase();
        }
    }
    public long getTheLengthOfFile(File file)
    {
        long len;
        len=file.length();
        return len;
    }



}
