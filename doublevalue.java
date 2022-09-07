import java.util.Scanner;
class doublevalue
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number and its Position : ");
    int v=sc.nextInt(),p=sc.nextInt();
    for(int i=1;i<p;i++)
    {
      v+=v;
    }
    System.out.println("At Position "+p+" value is "+v);
  }
}