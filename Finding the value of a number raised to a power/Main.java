import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int k=1;
      int i=0;
        Scanner in=new Scanner(System.in);
        int base=in.nextInt();
        int exponent=in.nextInt();
       while(i<exponent)
       {
         k*=base;
          i++;
       }
      System.out.println(k);
    }
}