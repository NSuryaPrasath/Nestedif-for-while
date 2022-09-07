import java.math.BigInteger;
public class chess
{
  public static void main(String args[])
  {
     long a=1,b=64;
     BigInteger v=BigInteger.valueOf(1);
     for(int i=1;i<64;i++)
     {
       v=v.add(v);
     }
     System.out.println("64th actual Value is "+v);
     System.out.println("But we cannot access the 2 power 64 value so the value is "+(~(a<<(b-1))));
  }
}