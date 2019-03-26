import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i,fact =1,sum = 0;
    for(i=1;i<=n;i++)
    {
    fact = fact * i;
  }
    System.out.println(fact);
}
}
