import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
       int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int k=great(n1,n2);
      if(k>n3)
      {
        System.out.print(k);
      }
       else
       {
          System.out.print(n3);
       }
    }
public static int great(int a,int b)
{
  if(a>b)
   return(a);
  else
    return(b);
}
}