import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int k,n,m,s;
    Scanner in=new Scanner(System.in);
        int l=in.nextInt();
       k=l/100;
       n=(l/10)%10;
       m=l%10;
      s=(m*100)+(n*10)+k;
     System.out.print(s);
  }
}