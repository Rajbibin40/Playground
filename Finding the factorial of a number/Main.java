import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int r;
    r=factorial(n);
    System.out.println(r);
  }
 public static int factorial(int n)
  {
    if(n ==1)
    {
      return (1);
    }
    else
    {
      return (n*factorial(n-1));
}
  }
}