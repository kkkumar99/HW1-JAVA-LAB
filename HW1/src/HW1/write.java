package HW1;
import java.io.*;
public class write {
	 public static void main(String[] args) throws IOException
	    {
	        String str = "File Handling in Java using "+
	                     " FileWriter and FileReader"+"\nBy K Kishore Kumar.";
	        FileWriter fw=new FileWriter("text.txt");
	        for (int i = 0; i < str.length(); i++)
	            fw.write(str.charAt(i));
	        fw.close();
	    }
}
