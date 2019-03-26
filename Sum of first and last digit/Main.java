import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n;
      int a=0,b=0,c=0;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      if(n < 100)
      {
        a = n%10;
        b = n/10;
        System.out.println(a+b);
      }
      else if(n <1000)
      {
        a = n%10;
        b = n/100;
        System.out.println(a+b);
      }
      else if(n<10000)
      {
        a = n%10;
        b = n/1000;
        System.out.println(a+b);
      }
      else
      {
        a = n%10;
        b = n/10000;
        System.out.println(a+b);
      }
    }
}
