class Account{  
int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=Integer.parseInt(args[0]);  
name=args[1];  
amount=Integer.parseInt(args[2]);  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  
//Creating a test class to deposit and withdraw amount  
class TestAccount{  
public static void main(String[] args){  
}}   