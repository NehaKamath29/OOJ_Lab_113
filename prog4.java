import java.util.*;
abstract class Shape
{
    int a,b; 
    abstract public void printArea();
    void assign_twovar(int x,int y)
    {
        a=x;
        b=y;
    }
    void assign_onevar(int x)
    {
        a=x;
    }
}
class Rectangle extends Shape
{
    public void printArea()
    {
        
       System.out.println("The area of rectangle is "+(a*b)+"cm sq"); 
    }
}
class Triangle extends Shape
{
    public void printArea()
    {
       System.out.println("The area of triangle is "+(0.5*a*b)+"cm sq"); 
    }
}
class Circle extends Shape
{
    public void printArea()
    {
       System.out.println("The area of circle is "+(3.14*a*a)+"cm sq"); 
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,dim1,dim2;
        while(true)
        {
            System.out.println("Enter 1 to find area of rectangle.\nEnter 2 to find area of triangle.\nEnter 3 to find area of circle.\nEnter 4 to exit!");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                   Rectangle rec=new Rectangle();
                   System.out.println("Enter the length and breadth of rectangle in cm:");
                   dim1=sc.nextInt();
                   dim2=sc.nextInt();
                   rec.assign_twovar(dim1,dim2);
                   rec.printArea();
                   break;
                   
                case 2:
                   Triangle tri=new Triangle();
                   System.out.println("Enter the length and height of triangle in cm:");
                   dim1=sc.nextInt();
                   dim2=sc.nextInt();
                   tri.assign_twovar(dim1,dim2);
                   tri.printArea();
                   break; 
                   
                case 3:
                   Circle cir=new Circle();
                   System.out.println("Enter the radius of circle in cm:");
                   dim1=sc.nextInt();
                   cir.assign_onevar(dim1);
                   cir.printArea();
                   break; 
                   
                case 4:
                    System.exit(0);
                    
                default:
                System.out.println("You have entered a wrong choice!");
                sc.close();
                
            }}}}
