import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here
      int n,s;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      s = square(n);
      System.out.println(s);
    }
  public static int square(int m)
  {
    int l;
    l = m*m;
    return l;
  }
}