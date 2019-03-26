import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int n;
      Scanner in = new Scanner(System.in);
		// Type your code here
      n= in.nextInt();
        if( n%400==0 || n%4==0 && n%100!=0)
           System.out.println("Leap year");
           else
           System.out.println("Non Leap year");
    }
}