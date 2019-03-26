import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
     Scanner in = new Scanner(System.in);
      int r_s = in.nextInt();
    int c_s = in.nextInt();
    int matrix1[][]=new int[r_s][c_s];
    int matrix2[][]=new int[r_s][c_s];
    int i,j;
    for(i=0;i<=r_s-1;i++)
    {
      for(j=0;j<=c_s-1;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
    }
    for(i=0;i<=r_s-1;i++)
    {
      for(j=0;j<=c_s-1;j++)
      {
        matrix2[i][j] = matrix1[j][i];
      }
    }
     for(i=0;i<=r_s-1;i++)
    {
      for(j=0;j<=c_s-1;j++)
      {
        System.out.print(matrix2[i][j] + " " );
          }
       System.out.println();
}
  }
}

    
 