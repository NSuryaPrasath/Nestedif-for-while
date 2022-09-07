import java.util.Scanner;
import java.util.ArrayList;
class Simple
{	
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age : ");
    int n=sc.nextInt();
    if(n>=17 && n<=20)
    {
       System.out.print("Enter Your Qualification - Diptech or 12th ");
       String s=sc.next();
       if((s.equals("Diptech"))||(s.equals("12th")))
       {
          System.out.println("You are Eligible to Zoho Schools");
       }
       else
       {
         System.out.println("You are not Eligible");  
       }
    }
    else
    {
       if(n>20)
       {
          if(n<=24)
          {
             System.out.println("You are Elgiible to Zoho School of Graduate Studies"); 
          }
          else
          {
             System.out.println("You are not Eligible for Gradute Studies");
          }
       }
       else
       {
          System.out.println("You are not Eligible for both the Zoho School and Gradute Studies");
       } 
    }
  }
}
