//sum of elements in an array
class SumArray
{

public static void main(String arg[])
	{
		int sum=0;
		int a[]=new int[5];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
	for(int i=0;i<5;i++)
	{
	sum=sum+a[i];
	}
	System.out.println("Sum of all the elements is " +sum);

	}
}