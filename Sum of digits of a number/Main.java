import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int a,b=0;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      while(n>0)
      {
        a = n%10;
        b= b+a;
        n= n/10;
      }
      System.out.println(b);
	}
}