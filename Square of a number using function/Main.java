import java.util.Scanner;
class Main
{

  static int square(int b)
  {
    int k;
    k=b*b;
    return (k);
  }
	public static void main (String[] args)
    {
        int c;
	   Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        c=square(n);
        System.out.println(c);
	} 
}