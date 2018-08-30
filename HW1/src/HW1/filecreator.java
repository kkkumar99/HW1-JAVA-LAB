package HW1;
import java.util.List;
import java.io.FileWriter;
public class filecreator {
	public String IntToString(int x ,int y)
	  {
		  if(y - Integer.toString(x).length() == 0)
		  {
			  return Integer.toString(x);
		  }
		  else if(y - Integer.toString(x).length() == 1)
		  {
			 return  (" "+Integer.toString(x));
		  }
		  else 
		  {
			  return "  "+Integer.toString(x);
		  }
	  }
	public void init(List <Student> students) 
	  {
		String s;   
	    try { FileWriter fw=new FileWriter("E:\\KishoreJava\\HW1\\HW1\\HW1-output.txt",true);
		s = "Stdnt Id  Ex  ------- Assignments ---------  Tot  Mi  Fin  CL  Pts  Pct  Gr"+"\n";
		fw.write(s);
		s = "--------  --  -----------------------------  ---  --  ---  --  ---  ---  --"+"\n";
		fw.write(s);
	    double avg = 0.0;
		int counta=0,countb=0,countc=0,countd=0,countf=0;
		int maxPts =0;
		for(Student s1:students)
	    {
		if( (Long.toString(s1.student_id)).length() ==7)
		{
			s = "0"+Long.toString(s1.student_id);
		}
		else
		{
		  s = Long.toString(s1.student_id);
		}
		s +="  "+ Integer.toString(s1.ex)+" ";	
		for(int i=0;i<10;i++)
		{
			s += " "+IntToString(s1.assignment[i],2);
		}
		s += "  "+IntToString(s1.total,3);
		s += "  "+IntToString(s1.minor,2);
		s += "   "+IntToString(s1.fin,2);
		s += "  "+IntToString(s1.cl,2);
		s += "  "+IntToString(s1.pts,3);
		s += "   "+IntToString(s1.pct,2);
		s += "   "+s1.Gr+" \n";
		avg += s1.pct;
		switch (s1.Gr)
		{
			case 'A':counta++;break;
			case 'B':countb++;break;
			case 'C':countc++;break;
			case 'D':countd++;break;
			case 'F':countf++;break;
		}
		if(maxPts < s1.pts)
		{
			maxPts = s1.pts;
		}
		fw.write(s);
		}
		 fw.write("\n\n");
		      s = "Average total point percent of all students: ";
		           s += Double.toString(Math.round(avg/students.size())) + "\n";
		           fw.write(s);
		           fw.write("Number of A's = " + Integer.toString(counta)+"\n");
		           fw.write("Number of B's = " + Integer.toString(countb)+"\n");
		           fw.write("Number of C's = " + Integer.toString(countc)+"\n");
		           fw.write("Number of D's = " + Integer.toString(countd)+"\n");
		           fw.write("Number of F's = " + Integer.toString(countf)+"\n\n");
		           fw.write("Maximum points =" + Integer.toString(maxPts)+"\n");
		           fw.close();
			}
	catch(Exception e)
	{
		System.out.println(e);
	}
}  

}
 