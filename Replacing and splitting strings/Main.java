import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int n=in.nextInt();
      String[] splited = str2.split("\\s+");
         for (String a : splited) 
            System.out.println(a); 
    } 
    }