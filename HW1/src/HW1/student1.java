package HW1;
import java.io.*;
public class student1 {
	public static void main(String[] args)throws Exception
	  {
	  File file = new File("E:\\KishoreJava\\HW1\\HW1\\HW1-data.txt");
	 
	  BufferedReader br = new BufferedReader(new FileReader(file));
	 
	  String st;
	  while ((st = br.readLine()) != null)
	    System.out.println(st);
	  br.close();
	  }
	
}
