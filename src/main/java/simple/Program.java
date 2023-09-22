package simple;

import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  throws Exception{


        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String str1 = (String) br1.readLine();
        System.out.println(str1);
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
        String str2 = (String) br2.readLine();
        System.out.println(str2);
        FileWriter fw = new FileWriter("file.txt", true);
        fw.write(str1);
        fw.append(" + ");
        fw.write(str2);
        br1.close();
        br2.close();
        fw.close();

}
}
