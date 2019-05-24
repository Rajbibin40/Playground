import java.util.Scanner;
class Main { 
	public static void main(String[] args){
          int k=0;
  		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
  		for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
             if(k==0)
             {
            System.out.print("*");
               k=1;
             }
            else
            {
            System.out.print("#");
              k=0;
            }
            
          }
          System.out.print("\n");
    }
}
}