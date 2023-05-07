// Write a program to find the grade of 2 students based on total marks(3 subjects)  Get the student‟s marks by constructor  Return total mark to in main method  Find the grade of each student.
class GradeConst
{
	int mark1=80,mark2=70,mark3=75,total;
	static float avg;
	
	public GradeConst()
	{
		total=mark1+mark2+mark3;
		avg=total/3;
		System.out.println("Student A");
		System.out.println("Total mark: " +total);
		System.out.println("Average:" +avg);
		GradeConst.display();
	}
	
	public GradeConst(int mark1,int mark2,int mark3)
	{
		total=mark1+mark2+mark3;
		avg=(total/3);
		System.out.println("Student B");
		System.out.println("Total mark: " +total);
		System.out.println("Average: " +avg);
		GradeConst.display();
	}
	public static void display()
	
	{
		if(avg>=90)
		{
			System.out.println("Grade A");
		}
		else if(avg>=80)
		{
			System.out.println("Grade B");
		}
		else if(avg>=70)
		{
			System.out.println("Grade C");
		}
		else if(avg>=50)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Failed");
		}

		
	}
	
public static void main(String arg[])
{
	GradeConst obj1=new GradeConst();
	GradeConst obj2=new GradeConst(50,60,70);
}
}