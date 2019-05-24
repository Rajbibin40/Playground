import java.util.Scanner;
class Main
{

  static int sum(int b)
  {
    int s=0;
    for(int i=1;i<=b;i++)
    {
      s+=i;
    }
    return (s);
  }
	public static void main (String[] args)
    {
        int c;
	   Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        c=sum(n);
        System.out.println(c);
	} 
}