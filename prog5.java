import java.util.*;
class Account
{
    Scanner sc=new Scanner(System.in);
    int type_acc;
    double withdraw,deposit,balance;
    void checkbal(double bal)
    {
        balance=bal;
    }
}
class Current_Account extends Account
{
   Scanner sc=new Scanner(System.in);
   double min_bal=2000.0;
   double penalty=0.15*min_bal;
   int n;
   void penalty()
   {
        System.out.println("Bal: "+balance);
        
        
        if(balance<min_bal)
        {
            System.out.println("Balance amount is less than the minimum balance amount. You have to pay penalty to withdraw!");
            System.out.println("Enter 1 to proceed.\nEnter 0 to cancel the withdraw.");
            n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Penalty: "+penalty);
                balance=balance-penalty;
                System.out.println("Penalty deducted!");
                System.out.println("The balance amount is: "+balance);
            }
            else
            System.out.println("Withdraw cancelled!");
        }
        else
        {
            System.out.println("Enter the amount to be withdrawn:");
            withdraw=sc.nextDouble();
            if(withdraw<balance)
            {
                balance=balance-withdraw;
                System.out.println("Amount in your bank account: "+balance);
            }
            else
            System.out.println("Insufficient balance!");
        }
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        deposit=sc.nextDouble();
        balance=balance+deposit;
        System.out.println("Amount in your bank account: "+balance);
    }
}
class Savings_Account extends Account
{
    double inter;
    Scanner sc=new Scanner(System.in);
    
   void interest()
    {
        double time,rate;
        System.out.println("Enter the time in years:");
        time=sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate=sc.nextDouble();
        System.out.println("Interest will be compounded 5 times a year!");
        inter=balance*(Math.pow((1+rate/5),(5*time)));
        balance=balance+inter;
        System.out.println("Interest: "+inter);
        System.out.println("Amount in your bank account: "+balance);
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn:");
        withdraw=sc.nextDouble();
        if(withdraw<balance)
        {
            balance=balance-withdraw;
            System.out.println("Amount in your bank account: "+balance);
        }
        else
        System.out.println("Insufficient balance!");
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited:");
        deposit=sc.nextDouble();
        balance=balance+deposit;
        System.out.println("Amount in your bank account: "+balance);
    }
}
public class oojLabProg5
{
    
    public static void main(String args[])
    {
        int type_acc;
        double balance;
        
        Scanner sc=new Scanner(System.in);
        int choice;
        Current_Account curr= new Current_Account();
        Savings_Account save=new Savings_Account();
        System.out.println("Enter your name:");
        String cust_name=sc.nextLine();
        System.out.println("Enter the account number:\n");
        int acc_no=sc.nextInt();
        System.out.println("Enter 1 if it's a Current account.\nEnter 2 if it's a Savings  account.");
        type_acc=sc.nextInt();
        System.out.println("Name: "+cust_name);
        System.out.println("Account number: "+acc_no);
        switch(type_acc)
        {
            case 1:
                System.out.println("This is current account!");
                System.out.println("Enter the balance amount in your account:");
                balance=sc.nextDouble();
                curr.checkbal(balance);
                while(true)
                {
                    System.out.println("Enter 1 to withdraw\nEnter 2 to deposit\nEnter 3 to exit");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        curr.penalty();
                        break;
                    
                    case 2:
                        curr.deposit();
                        break;
                    case 3:
                        System.exit(0);
                    
                    default:
                    System.out.println("Invalid choice!");
                    break;
                }
                
                }
                //break;
            
            case 2:
                System.out.println("This is Savings account!");
                System.out.println("Enter the balance amount in your account:");
                balance=sc.nextDouble();
                save.checkbal(balance);
                while(true)
                {
                System.out.println("Enter 1 to withdraw\nEnter 2 to deposit\nEnter 3 to check your balance after interest\nEnter 4 to exit");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        save.withdraw();
                        break;
                    
                    case 2:
                        save.deposit();
                        break;
                    
                    case 3:
                        save.interest();
                        break;
                    
                    case 4:
                        System.exit(0);
                        
                    default:
                    System.out.println("Invalid choice!");
                    break;
                }
                    
                }
                //break;
                case 3:
                    System.exit(0);
                
                default:
                System.out.println("Invalid Choice!\n");
                sc.close();
        }
        
    }
}    

