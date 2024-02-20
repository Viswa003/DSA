import java.util.Scanner;
class Account
{
    String accName;
    String accNo;
    String bankName;
    void display(String accName,String accNo,String bankName)
    {
        this.accName=accName;
        this.accNo=accNo;
        this.bankName=bankName;
        System.out.println("Account Name:"+accName);
        System.out.println("Account Number:"+accNo);
        System.out.println("Bank Name:"+bankName);
    }
}
class CurrentAccount extends Account
{
    String tinNumber;
    
    CurrentAccount(String accName,String accNo,String bankName,String tinNumber)
    {
        this.accName=accName;
        this.accNo=accNo;
        this.bankName=bankName;
        this.tinNumber=tinNumber;
    }
    void display()
    {
       System.out.println("Tin Number:"+tinNumber);
    }
}
class SavingsAccount extends Account
{
    String orgName;
    
    SavingsAccount(String accName,String accNo,String bankName,String orgName)
    {
        this.accName=accName;
        this.accNo=accNo;
        this.bankName=bankName;
        this.orgName=orgName;
    }
    void display()
    {
        System.out.println("Organisation Name:"+orgName);
    }
}
class Main
{
    public static void main(String args[])
    {
        System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
        Scanner sc=new Scanner();
        int n=sc.nextInt;
        System.out.println("Enter Account details in comma seperated(Account Name,Account Number,Bank Name,Organisation Name)");
        Account acc=new Account();
        acc.display();
        if(n==1)
        {
            SA=new SavingsAccount(Morsh, 0338407226, Baroda, Amphisoft);
            SA.display();
        }
        else if(n==2)
        {
            CA=new CurrentAccount(Morsh, 0338407226, Baroda, 798902);
            CA.display();
        }
    }
}