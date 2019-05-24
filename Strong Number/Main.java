import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int k=1,temp=0,c=0,add=0;
      temp=n;
      while(n!=0)
      {
       int rem=n%10,f=1;
       for(int i=rem;i>=1;i--)
        {
         //k*=i;
         //int f=1;
         f=f*i;
         
         }
      //  c+=k;
        //int add=0;
        add=add+f;
        n=n/10;
      }
    //  System.out.println(c);
      if(add==temp)
       System.out.println("Yes");
      else
       System.out.println("No"); 
      }  // Type your code here
	}
