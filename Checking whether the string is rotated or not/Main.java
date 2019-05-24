import java.util.Scanner;
class Main
{
  static int isSubstring(String str2, String temp) 
    { 
        int M = str2.length(); 
        int N = temp.length(); 
      
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            int j; 
      
            /* For current index i, check for 
            pattern match */
            for (j = 0; j < M; j++) 
                if (temp.charAt(i + j) != str2.charAt(j)) 
                    break; 
      
            if (j == M) 
                return i; 
        } 
      
        return -1; 
  }
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String temp=str1+str1;
     int res = isSubstring(str2, temp);
      if(res== -1)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
    }
}