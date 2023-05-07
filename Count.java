//count of even numbers from 10 to 20
class Count
{
public static void main(String args[])
{
	int oddcount=0,evencount=0,i;
	for(i=10;i<=20;i++)
	{
		if(i%2==0)
		{
			evencount=evencount+1;
			
		}
		else
		{
			oddcount=oddcount+1;
			
		}
	}
		System.out.println("Even number count:" +evencount);
		System.out.println("Odd number count:" +oddcount);
	}
}

