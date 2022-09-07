import java.util.Scanner;
import java.util.ArrayList;
class nestedfor
{	
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age : ");
    int n=sc.nextInt(),i=0;
    while(i<n)
    {
      int k=n;
      while(k>i)
      {
         System.out.print(" ");
         k--;
      }
      int j=0;
      while(j<i)
      {
         System.out.print("*");
         j++;
      }
      int l=1;
      while(l<=i+1)
      {
         System.out.print("*");
         l++;
      }
      System.out.println();
      i++;
    }
  }
}
