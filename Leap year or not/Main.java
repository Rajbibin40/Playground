import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      boolean leap=false;
		Scanner in = new Scanner(System.in);
        int year=in.nextInt();
      if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.print("Leap year");
        else
            System.out.println("Non Leap year");
    }
}
      
	