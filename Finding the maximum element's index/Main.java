import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int max =0,temp=0;
   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int [] arr =new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=in.nextInt();
     }
     for(int i=0;i<n;i++)
     {
       if(arr[i]>max)
       {
         max=arr[i];
         temp=i;
       }
     }
    System.out.println(temp);
  }
}