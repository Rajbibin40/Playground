import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   int i,c,count=0,b=0,temp=0;
	    Scanner in=new Scanner(System.in);
        int k=in.nextInt();
      temp=k;
      int t1=0;
      t1=temp;
        while(k!=0)
        {
         k= k/10;
         count++;
        }
      
      while(temp!=0)
      {
       int rem= temp%10;
        temp=temp/10;
       b+= Math.pow(rem, count);
        
      }
      if(b==t1)
      System.out.println("Armstrong Number");
      else
       System.out.println("Not a Armstrong Number"); 
    }    
}