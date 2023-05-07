// Write a program to check whether the customer have discount (get 20% discount if total amount is greater than 5000) or not and get the final amount in main method. (static methods)  Get prices of items using parameterized method  Method 1 - Calculate total amount  Method 2 - Check discount 
 class Shopping
	 {  static int totalamount;
		static float discount,amount;
		
		public static void totalPrice(int price1,int price2)
		{	
		totalamount=price1+price2;
	//System.out.println("Total amount is " +totalamount);
		if(totalamount>5000)
		{
		discount=totalamount*0.2f;
		amount=totalamount-discount;
		System.out.println("Discounted amount is " +amount);
		}
		else
		{
		System.out.println("No discount,Total amount is " +totalamount);
		}
		}
		
 public static void main(String arg[])
 {
 Shopping.totalPrice(1000,3000);
 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
