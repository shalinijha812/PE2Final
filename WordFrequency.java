package myexercise;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class WordFrequency {
    public int getWordFrequency(File file) {
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder=new StringBuilder();
            String line=null;
            String ls=System.getProperty("line.separator");
            while((line=br.readLine())!=null)
            {
               stringBuilder.append(line);
               stringBuilder.append(ls);
            }
            // delete the last new line separator
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            br.close();

            String content = stringBuilder.toString();
            String[] splittedContentComma=content.split(",");
            String[] splittedContentSpace1=splittedContentComma[0].split(" ");
            String[] splittedContentSpace2=splittedContentComma[1].split(" ");
            String[] splittedContentSpace3=splittedContentComma[2].split(" ");
            String[] splittedContentSpace4=null;
            List list=new ArrayList(Arrays.asList(splittedContentSpace1));
            list.addAll(Arrays.asList(splittedContentSpace2));
            list.addAll(Arrays.asList(splittedContentSpace3));


//            Char temp[];
            int count;
            int arrcount[];
            for(int i=0;i<list.size();i++)
            {
               temp=list.get(i);
                System.out.println(list.get(i));

//                count=0;
//                for(int j=0;j<list.size();j++)
//                {
//                    if(temp.equals(list.get(j)))
//
//                        count=count+1;
//
//                }
//                System.out.print(splittedContentSpace[i]);
//                System.out.println(count);
            }
            return 0;
        }


        catch(Exception e)
            {
                e.printStackTrace();
                return 1;
            }



    }
}