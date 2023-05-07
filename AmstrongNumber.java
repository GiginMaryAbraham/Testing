class Amstrong
{
	public static void main(String arg[])
    {
		int n=500,r,sum=0,temp;
		temp=n;
		System.out.println("Given number is " +n);
	while(n!=0)
	{
		r=temp%10;
		sum=sum+(r*r*r);
		temp=temp/10;
	}
	//System.out.println("Sum is " +sum);
	if(sum==n)
	{
		System.out.println("It is an Amstrong number");
	}
	else
	{
		System.out.println("It is not an Amstrong number");
	}
}

}
