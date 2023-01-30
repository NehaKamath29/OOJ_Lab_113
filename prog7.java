class Thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class oojLabProg8
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
            t1.start();
            Thread2 t2=new Thread2();
            t2.start();
    }
}

    

