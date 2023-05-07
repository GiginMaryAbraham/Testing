//Area of figures(circle, rectangle, square) by using three methods(should have same method name)
class Areas
{
	public Areas(float a)
	{
	float pi=3.14f;
	float area=pi*a*a;
	System.out.println("Area of circle = " +area);
	}
	
	public Areas(int a,int b)
	{
	int area=a*b;
	System.out.println("Area of rectangle = " +area);
	}
	
	public Areas(int a)
	{
	int area=a*a;
	System.out.println("Area of square = " +area);
	}
	
	public static void main(String arg[])
	{
	Areas obj1=new Areas(3.25f);
	Areas obj2=new Areas(2,3);
	Areas obj3=new Areas(5);
	}
	
}