import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int i,j=0,t=0,t2=0;
        int s=in.nextInt();
       int[] arr =new int[s];
       for(i=0;i<=s-1;i++)
       {
         arr[i]=in.nextInt();
       }
      int search1=in.nextInt();
      int search2=in.nextInt();
      for(i=0;i<=s-1;i++)
      {
        if(arr[i]==search1)
        {
           //j;
          System.out.println(i);
         	++t;
          
        }
     
        if(arr[i]==search2)
        {
            //j=1;
           System.out.print(i);
        	++t2;
        }
      }   
      
      //System.out.print(j);
    if(t==0||t2==0)
    {
      
    System.out.println("-1");    
	}
    
}
}