import java.util.Scanner;
class Main{
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
      int i,max=0;
        int s=in.nextInt();
       int[] arr =new int[s];
       for(i=0;i<=s-1;i++)
       {
         arr[i]=in.nextInt();
       }
      for(i=0;i<=s-1;i++)
      {
        if(arr[i]>max)
          max=arr[i];
        }
        System.out.println(max);
    }
  

}