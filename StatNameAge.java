// program to set your name and age by a static method and get them in an another static method
class StatNameAge
{
	static String name;
	static int age;
	
	public static void display()
	{
	System.out.println("My name is " +name);
	System.out.println("My age is " +age);
	}

	public static void main(String arg[])
	{
	name="Gigin";
	age=30;
	StatNameAge.display();
	}
}