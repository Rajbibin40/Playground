import java.util.Scanner;
class Main {
 

	public static void main (String[] args) {
        
   Scanner a = new Scanner(System.in);
      int num1;
      int num2;
      num1= a.nextInt();
      num2=a.nextInt();
      if(num2>num1)
      {
        System.out.println("num2 is the greatest number");
      }
      else
      {
        System.out.println("num1 is the greatest number");
      }
	}
}