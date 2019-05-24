import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
        int count=1;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      for(int index = 0; index < arr_size; index++)
      {
        if(arr[index] == arr[index+1])
        {
          count++;
        }
        else
        {
          break;
        }
      }
      System.out.print(count);
    }
}