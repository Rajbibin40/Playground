import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       int i,temp=0;
  Scanner in= new Scanner(System.in);
    int n=in.nextInt();
   int [] arr=new int[n];
  for(i=0;i<n;i++)
  {
    arr[i]=in.nextInt();
  }
      for(i=0;i<n;i++)
      {
        if(arr[i]!= 0)
        {
          arr[temp]=arr[i];
          temp++;
         }
      }
        while(temp<n)
        {
          arr[temp]=0;
          temp++;
        }
      for(i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
        
      }
    }
}