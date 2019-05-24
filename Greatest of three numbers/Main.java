import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int num1;
         int num2;
      int num3;
      Scanner a=new Scanner(System.in);
      num1=a.nextInt();
      num2=a.nextInt();
      num3=a.nextInt();
      if((num1>num2) && (num1>num3))
      {
        System.out.println(num1);
      if((num2>num3) && (num2>num1))
      {
        System.out.println(num2);
      }
      }
        else
        {
System.out.println(num3);
        }
    }
}