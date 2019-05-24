import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      a[index] = sc.nextInt();  
    }
    int k=n/2;
    for(int j = 0; j <= n-k; j++)
    {
    for(int i=0;i<k-1;i++)
    {
      if(a[i]>a[i+1])
      {
        int temp = a[i];
         a[i] = a[i+1];
         a[i+1] = temp;
      }
    }
    }
    for(int i = 0; i < n; i++)
   System.out.print(a[i]+" ");
  }
}