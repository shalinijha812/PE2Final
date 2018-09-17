package myexercise;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FileReadExten {
    public int readFilesByte(File file)
    {   int flag=0;
        FileInputStream filemem=null;

        File folder=new File("/home/cgi/learnings");
        String filename=file.getName();
//        System.out.println(filename);
        String path=file.getAbsolutePath();
        File[] listOfFiles=folder.listFiles();
        byte fileContent[]=new byte[(int) file.length()];
        try {
            filemem=new FileInputStream(file);
            for (int i = 0; i < listOfFiles.length; i++) {
                if ((listOfFiles[i].getName()).equals(filename)) {
                    filemem.read(fileContent);
                }
                filemem.close();

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 1;
        }
        return flag;
    }
}
