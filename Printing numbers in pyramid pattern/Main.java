import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      int i,j,k,val,n;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      val = 1;
      for(i=1;i<=n;i++)
      {
        for(k=1;k<=n-i;k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print(val + " ");
          val++;
        }
        System.out.print("\n");
      }
    }
}

   