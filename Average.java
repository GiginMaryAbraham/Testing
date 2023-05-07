 //Write a program to find the a) Average of three integer numbers, three float numbers(should have same method name) 
 class Average
 {   
	 public Average(int a,int b,int c)
	 {
	 int sum=a+b+c;
	 float avg=sum/3;
	 System.out.println("Average is "+avg);
	 }
	 public Average(float a,float b,float c)
	 {
	 float sum=a+b+c;
	 float avg=sum/3;
	 System.out.println("Average is "+avg);
	 }
 public static void main(String arg[])
 {
 Average obj1=new Average(20,21,22);
 Average obj2=new Average(12.24f,22.45f,24.55f);
 }
 }
 