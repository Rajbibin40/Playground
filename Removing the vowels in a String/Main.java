import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
   // StringBuilder sb=new StringBuilder(str);
   // int l=sb.length();
   // int count=0;
    String k = str.replaceAll("[aeiouAEIOU]", ""); 
   /* for(int i=0;i<l;i++)
      {
      if (((sb.charAt(i) != 'a' ) || (sb.charAt(i) !='e')  || (sb.charAt(i) != 'i')||(sb.charAt(i) !='o') ||(sb.charAt(i) !='u')))
      }*/
    System.out.print(k);
  }
}