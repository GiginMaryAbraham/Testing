 //program to check whether the candidate is eligible for Voting(Use static method and boolean return type)
 class Vote
 {
 static int age=30;
 public static boolean age()
 {
 if(age>=18)
 {
 //System.out.println("Eligible for Voting");
 return true;
 }
 else
 {
 //System.out.println("Not Eligible for Voting");
 return false;
 }
 }
 public static void main(String arg[])
 {
 Vote.age();
 System.out.println(Vote.age());

 }
 }
 
 