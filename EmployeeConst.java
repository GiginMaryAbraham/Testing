//employee details using constructor
class EmployeeConst
{
	//int salary1;
	//String id1,name1,dept1;
	
	public EmployeeConst(String id1,int salary1,String name1,String dept1)
	{
	System.out.println("The employee name is " +name1);
	System.out.println("The employee id is " +id1);
	System.out.println("The employee salary is " +salary1);
	System.out.println("The employee dept is " +dept1);
	}
public static void main(String arg[])
{
EmployeeConst obj1=new EmployeeConst("FF1100",400000,"Simy","IT");
EmployeeConst obj2=new EmployeeConst("FF1101",800000,"Sinu","Marketing");
}
}