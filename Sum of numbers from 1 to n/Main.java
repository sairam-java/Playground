import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int i,sum = 0,n;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        sum = sum + i;
    }
  System.out.println(sum);
	}
}
