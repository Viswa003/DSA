import java.util.*;
class Account{
    protected String accName;
    protected String accNo;
    protected String bankName;
    public String getAccName(){
        public class Account {
            protected String accName;
            protected String accNo;
            protected String bankName;
            
            public void display() {
                System.out.println("Account Name:"+accName);
                System.out.println("Account Number:"+accNo);
                System.out.println("Bank Name:"+bankName);
            }
            
            public Account(String accName,String accNo,String bankName) {
                this.accName=accName;
                this.accNo=accNo;
                this.bankName=bankName;
            }
            
            
        }
        
        public class CurrentAccount extends Account {
            private String tinNumber;
            
            public void display() {
                super.display();
                System.out.println("TIN Number:"+tinNumber);
                
            }
            
            public CurrentAccount(String accName,String accNo,String bankName,String tinNumber) {
                super(accName,accNo,bankName);
                this.tinNumber=tinNumber;
            }
            
            public String getTinNumber() {
                return tinNumber;
            }
            
            public void setTinNumber(String tinNumber) {
                this.tinNumber=tinNumber;
            }
            
            
        }
        
        public class SavingsAccount extends Account {
            private String orgName;
            
            public void display() {
                super.display();
                System.out.println("Organisation Name:"+orgName);
                
            }
            
            public SavingsAccount(String accName,String accNo,String bankName,String orgName) {
                super(accName,accNo,bankName);
                this.orgName=orgName;
            }
            
            public String getOrgName() {
                return orgName;
            }
            
            public void setOrgName(String orgName) {
                this.orgName=orgName;
            }
            
            
        }
        
        import java.util.Scanner;
        
        public class Main {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
                int choice=sc.nextInt();
                sc.nextLine();
                switch(choice) {
                    case 1:
                        System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                        String input=sc.nextLine();
                        String[] details=input.split(",");
                        SavingsAccount sa=new SavingsAccount(details[0],details[1],details[2],details[3]);
                        sa.display();
                        break;
                    case 2:
                        System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                        input=sc.nextLine();
                        details=input.split(",");
                        CurrentAccount ca=new CurrentAccount(details[0],details[1],details[2],details[3]);
                        ca.display();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                sc.close();
            }
        }