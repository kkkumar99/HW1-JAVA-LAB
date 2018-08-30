package HW1;
public class Student 
{
   long student_id;
   int[] assignment;
   int ex;
   int fin,cl,pts,pct,minor;
   int total=0;
   String str;
   char Gr;
   public int roundof(double x)
   {
	   int a =(int) Math.round(x);
	   return a;
   }
   public void putstring(String str)
   {
	    str=str.replaceAll("  "," ");
		String[] small_str=str.split(" ");
		student_id = Long.parseLong(small_str[0]);
		ex = Integer.valueOf(small_str[1]);
		assignment= new int[10];
		for(int i=2;i<12;i++)
		{
			assignment[i-2] = Integer.valueOf(small_str[i]);
			total+=assignment[i-2];
		}
		minor=Integer.valueOf(small_str[12]);
		fin=Integer.valueOf(small_str[13]);
		cl=Integer.valueOf(small_str[14]);
		pts=ex+total+minor+fin+cl;
		double temp;
		temp=((double)pts*100)/420;
		pct=roundof(temp);
		if(pct>=90)
			Gr='A';
		else if(pct>=78 && pct<90)
			Gr='B';
		else if(pct>=62 && pct<78)
			Gr='C';
		else if(pct>=46 && pct<62)
			Gr='D';
		else if(pct<=45)
			Gr='F';
   }
}
