import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<=(s-1);i++)
      {
        arr[i]=in.nextInt();
      }
      subsets_3(s,arr);
    }
  public static void subsets_3(int s,int arr[])
  {
    for(int i=0;i<=(s-2);i++)
    {
      for(int j=i+1;j<=(s-1);j++)
      {
        for(int k=j+1;k<=(s-1);k++)
        {
         System.out.print("("+ arr[i] + "," +" "+ arr[j] + "," +" "+ arr[k] + ")"+" "); 
        }
 }System.out.println();
    }
  }
}