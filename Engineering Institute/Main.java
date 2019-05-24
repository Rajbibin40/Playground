import java.util.Scanner;
class Faculty
{
  public void salary(int base)
  {
    //write your Faculty class statements
    if(base>0)
    {
    System.out.println("Base Salary: "+base);
    }
    else
    {
    System.out.println("null");
    }
    
  }
}
class CSE extends Faculty
{
  public void salary(int base,int bonus)
  {
    //write your CSE class statements
    if(base>0)
    {
    int i=0;
    i=base+bonus;
    System.out.print("CSE Faculty: ");
    System.out.println(i);
    }
    else
    {
    System.out.println("null");
    }
    
  }
}
class IT extends Faculty
{
  public void salary(int base,int bonus)
  {
    //write your IT class statements
      if(base>0)
    {
    int i=0;
    i=base+bonus;
    System.out.print("IT Faculty: ");
    System.out.println(i);
    }
    else
    {
    System.out.println("null");
    }
    
  }
}
class ECE extends Faculty
{
  public void salary(int base,int bonus)
  {
    //write your ECE class statements
      if(base>0)
    {
    int i=0;
    i=base+bonus;
    System.out.print("ECE Faculty: ");
    System.out.println(i);
    }
    else
    {
    System.out.println("null");
    }
    
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    CSE C =new CSE();
    IT I=new IT();
      Faculty f=new Faculty();
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
    f.salary(s);
    C.salary(s,3000);
    I.salary(s,5000);
    obj.salary(s,4500);
    
    
    //implement your required concept here
  }
}