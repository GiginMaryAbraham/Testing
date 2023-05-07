//program to find the factorial of a number(static method)  Output – “Factorial of <given number> is <result>
class FactorialOfNumber
{
	static int i,n=5,f=1;
	public static void Fact()
	{
	for (i=n;i>=1;i--)
	{
		f=f*i;
	}
	System.out.println("Factorial of " +n+ " is =" +f );
	
	}
public static void main(String arg[])
{
FactorialOfNumber.Fact();
}
	
}

