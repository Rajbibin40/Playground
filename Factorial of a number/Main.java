import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int k=1;
        for(int i=1;i<=n;i++)
        {
          k*=i;
        }
        System.out.println(k);
      }
	}
