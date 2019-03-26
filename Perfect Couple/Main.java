import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code h
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]=new int[n];
      int i,j;
      for(i=0;i<=n-1;i++)
      {
        arr[i]= in.nextInt();
      }
      int search = in.nextInt();
      int sum =0;
      for(i=0;i<=n-1;i++)
      {
        for(j=i+1;j<=n-1;j++)
        {
          sum = arr[i]+arr[j];
          if(sum==search)
          {
            System.out.println(arr[i]+", "+arr[j]);
          }
        }
      }
    }
}

   