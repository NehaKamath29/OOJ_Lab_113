import java.util.*;
class Student 
{
    String usn,name;
    int credits[]=new int[10];
    int see[]=new int[10];
    int cie[]=new int[10];
    void initialise(String usn,String name)
    {
        this.usn=usn;
        this.name=name;
    }
    void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("USN: "+this.usn);
    }
    void calculate(int cred[],int s[],int c[])
    {
        double sgpa;
        double sum=0.0;
        credits=cred;
        see=s;
        cie=c;
        int t_cred=0;
        for(int i=0;i<7;i++)
        {
            t_cred=t_cred+cred[i];
            if(c[i]<20)
            sum=sum+0.0;
            else
            {
            if(s[i]>=90 && s[i]<=100)
            sum=sum+credits[i]*10;
            if(s[i]>=80 && s[i]<=89)
            sum=sum+credits[i]*9;
            if(s[i]>=70 && s[i]<=79)
            sum=sum+credits[i]*8;
            if(s[i]>=60 && s[i]<=69)
            sum=sum+credits[i]*7;
            if(s[i]>=55 && s[i]<=59)
            sum=sum+credits[i]*6;
            if(s[i]>=50 && s[i]<=54)
            sum=sum+credits[i]*5;
            if(s[i]>=40 && s[i]<=49)
            sum=sum+credits[i]*4;
            if(s[i]>=0 && s[i]<=39)
            sum=sum+credits[i]*0;
            }
        }
        System.out.println("Total credits: "+t_cred);
        sgpa=sum/t_cred;
        System.out.println("SGPA: "+sgpa);
    }
}
 public class oojLabProg2
{
    public static void main(String args[])
    {
        int cred[]=new int[7];
        int s[]=new int[7];
        int c[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String n=sc.nextLine();
        System.out.println("Enter your usn:");
        String u=sc.nextLine();
        System.out.println("Maths "+"Physics "+"BEE "+"ECM " +"IDT "+"EVI "+"English");
        System.out.println("Enter the credits:");
        for(int i=0;i<7;i++)
        {
            cred[i]=sc.nextInt();
        }
        System.out.println("Enter cie marks:");
        for(int i=0;i<7;i++)
        {
            c[i]=sc.nextInt();
        }
        System.out.println("Enter see marks:");
        for(int i=0;i<7;i++)
        {
            s[i]=sc.nextInt();
        }
        Student st=new Student();
        st.initialise(u,n);
        st.display();
        st.calculate(cred,s,c);
    }
}
