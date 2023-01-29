import java.util.*;
class Quadratic
{
    int a,b,c;
    double d,r1,r2;
    void check(int x,int y,int z)
    {
        a=x;
        b=y;
        z=c;
        d=((b*b)-(4*a*c));
        if(a==0)
        System.out.println("Invalid quadratic expression!\n");
        else
        {
            if(d>0)
            {
                System.out.println("The roots are real and distinct!\n");
                r1=(-b+Math.sqrt(d))/(2*a);
                r2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("The roots are: "+r1+" and "+r2+".");
            }
            else if(d<0)
            {
                System.out.println("The roots are imaginary!");
                r1=(-b+Math.sqrt(Math.abs(d)))/(2*a);
                r2=(-b-Math.sqrt(Math.abs(d)))/(2*a);
                System.out.println("The roots are: "+r1+" and "+r2+".");
            }
            else if(d==0)
            {
                System.out.println("The roots are real and equal!");
                r1=(-b)/(2*a);
                r2=(-b)/(2*a);
                System.out.println("The roots are: "+r1+" and "+r2+".");
            }
        }
    }
}
public class oojLabProg1
{
    public static void main(String args[])
    {
        Quadratic ob= new Quadratic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of quadratic coefficients a, b and c:");
        ob.a=sc.nextInt();
        ob.b=sc.nextInt();
        ob.c=sc.nextInt();
        ob.check(ob.a, ob.b, ob.c);
        sc.close();
    }
}
