import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int k=0,b=0,m=0;
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int [] arr =new int[n];
    for(int i=0;i<n;i++)
     {
       arr[i]=in.nextInt();
     }
   if(n%2==0)
   {
     for(int i=0;i<n/2;i++)
     {
       k+=arr[i];
     }
     for(int i=n/2;i<n;i++)
     {
       b+=arr[i];
     }
     if(k==b)
    {
      System.out.println("Perfect Batch");
     }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
   }
 else 
  {
    m=n/2;
     
     for(int i=0;i<m;i++)
     {
       k+=arr[i];
     }
     for(int i=m+1 ;i<n;i++)
     {
       b+=arr[i];
     }
   
  if(k==b)
    {
      System.out.println("Perfect Batch");
     }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
}
}
}