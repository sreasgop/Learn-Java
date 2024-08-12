// Question: Create a class Account with private properties accountNumber, balance, and ownerName. Provide public getter and setter methods for these properties. Implement a method deposit() to add money to the account and withdraw() to subtract money from the account, ensuring the balance doesn't go negative.
// Focus: Encapsulation and data hiding.

import java.util.Random;

class Account{

    private static Random rand = new Random();

    private final int accountNumber;
    private String userName;
    private float balance;

    // Constructors:
    public Account(){
        this.accountNumber = rand.nextInt(9999);
    }

    public Account(String userName, float balance) {
        this();
        this.userName = userName;
        this.balance = balance;
    }


    // Setter Methods:
    public void setUserName(String userName) {
        this.userName = userName;
    }



    // Getter Methods:
    public static int getAccountNumber(Account acc){
        return acc.accountNumber;
    }


    public String getUserName() {
        return this.userName;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }


    public float getBalance() {
        return this.balance;
    }

    // Functions:
    public int deposit(float money){
        this.balance+=money;
        return 0;
    }

    public int withdraw(float money){
        if(money>this.balance){
            System.out.print("Sufficient ammount unavailable to make withdrawal!\nAvailable Balance: ");
            System.out.println(this.balance);
            return 1;
        }
        System.out.print("Transaction Successful: "+money + " withdrawn.\nAvailable Balance: ");
        System.out.println(this.balance);
        return 0;
    }

    @Override
    public String toString() {
        return "\nAccount \n [ Account Number: " + accountNumber + " ]\n [ User Name: " + userName + " ]\n [ Available Balance: " + balance + "]\n";
    }
    
    
}

public class Q4_Encapsulation {
    public static void main(String[] args) {
        
        Account accObj = new Account();
        System.out.println(accObj);


    }
}
