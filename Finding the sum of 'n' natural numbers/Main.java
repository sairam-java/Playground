import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int sum = 0,i;
      int n = in.nextInt();
      for(i=n;i>=0;i--)
      {
        sum = sum + i;
    }
      System.out.println(sum);
    }
}