import java.util.*;
class atm
{
    String accNo="46725146483725";
    double balance=1426725.00;
    int transactions=0,pin=2345;
    String thistory="";
    public boolean login()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter account number");
        String uaccNo=Sc.nextLine();
        boolean l=false;
        if(accNo==uaccNo)
        {
            System.out.println("Enter name");
            String name=Sc.nextLine();
            System.out.println("Enter pin");
            Sc.nextLine();
            int upin=Sc.nextInt();
            if(pin==upin)
            {
                System.out.println("Logged in successfully!");
                l=true;
            }
            else
            System.out.println("Incorrect pin!");
        }
        else
        {
        	System.out.println("Account not found!");
        }
        return l;
    }
    public void transaction_history()
    {
        if(transactions!=0)
        System.out.println(thistory);
        else
        System.out.println("No transactions are performed!");
    }
    public void withdraw()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter amount");
        double w=Sc.nextDouble();
        if(balance>w)
        {
            if(w>10000)
            System.out.println("Withdrawl above 10000 is not permitted!");
            else
            {
                balance-=w;
                System.out.println("Current balance:"+balance);
            }
        }
        else
        System.out.println("Not enough balance!");
    }
    public void deposit()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter amount");
        double w=Sc.nextDouble();
        balance+=w;
        System.out.println("Current balance:"+balance);
    }
    public void transfer()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter recepient's account number");
        String uaccNo=Sc.nextLine();
        System.out.println("Enter account to be transferred");
        Sc.nextLine();
        double w=Sc.nextDouble();
        if(balance>w)
        {
            if(w<=50000)
            {
                balance-=w;
                System.out.println("Funds transferred successfully!");
            }
            else
            System.out.println("Transfer above 50000 is not permitted!");
        }
        else
        System.out.println("Not enough balance!");
    }
}
public class bank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        atm a = new atm();
        System.out.println("------------- WELCOME to ATM -------------");
        System.out.println("Please Enter your card");
        
        boolean isValid = a.login();
        if(isValid) {
            boolean flag = false;
            while(!flag) {
                System.out.println("Enter your choice");
            System.out.println("1.Transactions History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Exit\n");
            int choice = sc.nextInt();
            switch(choice){
                    case 1:
                        a.transaction_history();
                        break;
                    case 2:
                        a.withdraw();
                        break;
                    case 3:
                        a.deposit();
                        break;
                    case 4:
                        a.transfer();
                        break;
                    case 5:
                        flag = true;
                        System.out.println("Thankyou for visiting!!!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");                
                }
            }
        }
    }
}