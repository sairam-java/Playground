import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n1,n2,n3,res;
      Scanner in = new Scanner(System.in);
       n1 = in.nextInt();
       n2 = in.nextInt();
       n3 = in.nextInt();
       res = greater(n1, n2);
      if(res > n3)
        System.out.println(res);
      else
        System.out.println(n3);
    }
  public static int greater( int n1 , int n2)
  {
    int res1;
    if(n1 > n2)
    {
      res1 = n1;
    }
    else 
    {
      res1 = n2;
    }
    return res1;
  }
}

  
      