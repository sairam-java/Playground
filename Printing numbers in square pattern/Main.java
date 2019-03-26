import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,j,n,num=0;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i = 1;i<=n;i++)
      {
        for(j = 1;j<=n;j++)
        {
          System.out.print(i);
          num = num + i;
        }
        System.out.print("\n");
          
	}
}
}