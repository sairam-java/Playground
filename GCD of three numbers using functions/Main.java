import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      int n1,n2,n3,res;
      Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
      res = gcd(n1, n2);
      while(res != n3)
      {
       if(res > n3)
       res = res - n3;
        else
        n3 = n3 - res;
      }
      System.out.println(n3);
    }
  public static int gcd(int n1 , int n2)
  {
    while(n1 != n2)
    {
      if(n1 > n2)
        n1 = n1 - n2;
      else
        n2 = n2 - n1;
    }
    return n2;
  }
}
