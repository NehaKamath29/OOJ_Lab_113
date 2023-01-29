import java.util.*;
class WrongAge extends Exception
{
    int a;
    String s;
    WrongAge(int x)
    {
        a=x;
    }
    public String toString()
    {
        if(a<=0)
        s="Invalid Age!";
        return s;
    }
}
class WrongSonAge extends Exception
{
    int s_a,f_a;
    String str;
    WrongSonAge(int x, int y)
    {
        s_a=x;
        f_a=y;
    }
    public String toString()
    {
        if(s_a>=f_a)
         str= "Son's age cannot be more than or equal to father's age!";
        return str;
    }
}

class Father
{
     Scanner sc=new Scanner(System.in);
    int f_age;
    Father() throws WrongAge 
    {
        System.out.println("Enter father's age:");
	    f_age=sc.nextInt();
        if(f_age<=0)
         throw new WrongAge(f_age);
    }
}

class Son extends Father
{
     Scanner sc=new Scanner(System.in);
    int son_age;
    Son() throws WrongAge 
    {
        
        System.out.println("Enter son's age:");
	    son_age=sc.nextInt();
    }
    void check()throws WrongAge{
        if(son_age<=0)
    
        throw new WrongAge(son_age);
    }
    void compare() throws WrongSonAge
    {
        if(son_age>=f_age)
        throw new WrongSonAge(son_age,f_age);
        else
        {
            System.out.println("Father's age: "+f_age);
            System.out.println("Son's age: "+son_age);
        }
    }
}
public class oojLabProg6
{
	public static void main(String[] args) 
	{
	   
	    Scanner sc=new Scanner(System.in);
	   try
	    {
	        Son obj2=new Son();
	        obj2.check();
	        obj2.compare();
	     }
	     catch(WrongAge e)
	     {
	         System.out.println(e);
	     }
	     catch(WrongSonAge e)
	     {
	         System.out.println(e);
	     }
         sc.close();
	}
}
