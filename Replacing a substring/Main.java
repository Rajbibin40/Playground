import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String str3=in.nextLine();
     String strrpl = str1.replaceAll(str2,str3);
       System.out.print(strrpl);
    }
}