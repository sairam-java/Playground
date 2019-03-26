import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,j,val,n;
      Scanner in = new Scanner(System.in);
        n = in.nextInt();
      val = n;
      for(i=1;i<=n;i++)
      {
        for(j=val;j>=1;j--)
        {
          System.out.print(j);
        }
        val--;
        System.out.println();
	}
}
}
