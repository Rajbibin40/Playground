import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int k;
      int sum=0;
        k=n%10;
       while(n>10)
       {
         n=n/10;
	}
      sum=k+n;
      System.out.println(sum);
}
}