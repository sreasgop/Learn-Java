// Question: Create a class BankAccount with methods deposit() and withdraw(). Implement exception handling to throw an InsufficientFundsException if a withdrawal request is more than the current balance. Write code to test this exception handling.
// Focus: Custom exceptions, try-catch blocks, and robust error handling.


class BankAccount{

    private static int accountNumberSerial = 2024000;

    private int accountNumber;
    private String name; 
    private int balance;

    public BankAccount(){
        this.accountNumber = accountNumberSerial++;
    }

    public BankAccount(String name, int openingBalance){
        this();
        this.name = name; 
        this.balance = openingBalance;
    }


    public void deposit(){
        
    }

    public void withdraw(){

    }


    // Getters:
    public String getAccountNumber(){
        return Integer.toString(accountNumberSerial);
    }

    @Override
    public String toString() {
        return "BankAccount\n [ accountNumber = " + accountNumber + " ]\n [ name = " + name + "]\n [ balance = " + balance + " ]\n";
    }

    
}


public class Q10_ExceptionHandling {
    public static void main(String[] args) {

        BankAccount accObj = new BankAccount();
        BankAccount accObj2 = new BankAccount();
        BankAccount accObj3 = new BankAccount();
        BankAccount accObj4 = new BankAccount();

        System.out.println(accObj4);


    }    
}
