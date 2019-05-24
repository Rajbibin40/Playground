import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sum;
      sum=natural_sum(n);
      System.out.print(sum);
    }
  public static int natural_sum(int n)
  {
    if(n==1)
    {
      return (1);
}
    else
    {
      return (n+natural_sum(n-1));
    }
  }
}