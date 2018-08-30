package HW1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CSX_358_HW1_16110023 
{
  public static void main(String[] args) throws FileNotFoundException
  { File file = new File("E:\\KishoreJava\\HW1\\HW1\\HW1-data.txt");
  Scanner sc = new Scanner(file);
  String s;
  List <Student> students = new ArrayList<Student>();
	Student student;
		while(sc.hasNextLine())
		{
			student = new Student();
			s = sc.nextLine();
			System.out.println(s);
			student.putstring(s);
			students.add(student);
		} sc.close();
filecreator fw = new filecreator();
fw.init(students);
  }
}
