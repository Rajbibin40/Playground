import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int i;
	    Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        for(i=1;i<=k;i++)
        {
          if(k%i==0)
          System.out.println(i);
        }
     }
}