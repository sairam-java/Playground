import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,m;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      m = sum(n);
      System.out.println(m);
    }
  public static int sum(int l)
  {
    int sum=0;
    while(l!=0)
    {
      sum = sum + l;
      l--;
    }
      return sum;
    }
  
}


     