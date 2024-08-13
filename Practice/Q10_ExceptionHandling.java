// Question: Create a class BankAccount with methods deposit() and withdraw(). Implement exception handling to throw an InsufficientFundsException if a withdrawal request is more than the current balance. Write code to test this exception handling.
// Focus: Custom exceptions, try-catch blocks, and robust error handling.

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Not enough balance in account to complete the transaction.");
    }
}


class BankAccount{

    private static int accountNumberSerial = 2024000;

    private int accountNumber;
    private String name; 
    private float balance;


    public BankAccount(){
        this.accountNumber = accountNumberSerial++;
    }

    public BankAccount(String name, int openingBalance){
        this();
        this.name = name; 
        this.balance = openingBalance;
    }


    // Getters:
    public static String getAccountNumber(BankAccount acc){
        return Integer.toString(acc.accountNumber);
    }

    public String getAccountNumber(){
        return Integer.toString(accountNumber);
    }
    
    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }  


    // Setters
    public void setName(String name){
        this.name = name;
    }


    // deposit() and withdraw() methods:
    public int deposit(float money){
        this.balance+=money;
        System.out.println("\nTransaction Summary: ");
        System.out.println("Dear " + this.name + ", ");
        System.out.println(money + " credited to account no. " + this.accountNumber + ",\nAvailable Balance: "+this.balance);
        return 0;
    }

    public int withdraw(float money) throws InsufficientFundsException{
        
        // Handling the exception from within the method only using try-catch blocks:
        // try {
        //     if(money<=balance){
        //         this.balance-=money;
        //         System.out.print(money + " debited from account: " + this.accountNumber + ".\nAvailable Balance: ");
        //         System.out.println(this.balance);
        //         return 0;
        //     } else{
        //         throw new InsufficientFundsException();
        //     } 
        // } catch (InsufficientFundsException e) {
        //     System.out.println(e);
        // }
        // return 1;
        
        // Dunking the Exception Handling by using the throws keyword:
        if(money<=balance){
            this.balance-=money;
            System.out.println("\nTransaction Summary: ");
            System.out.println("Dear " + this.name + ", ");
            System.out.print(money + " debited from account no. : " + this.accountNumber + ",\nAvailable Balance: ");
            System.out.println(this.balance);
            return 0;
        } else{
            throw new InsufficientFundsException();
        } 
    }  


    @Override
    public String toString() {
        return "\nBankAccount\n [ accountNumber = " + accountNumber + " ]\n [ name = " + name + "]\n [ balance = " + balance + " ]";
    }

}


public class Q10_ExceptionHandling {
    public static void main(String[] args) {

        BankAccount accObj1 = new BankAccount();
        accObj1.setName("Chandra Sreas Gop");
        accObj1.deposit(137000);

        try {
            accObj1.withdraw(5550);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

        System.out.println(accObj1);
    }    
}
