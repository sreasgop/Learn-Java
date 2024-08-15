// Question: Create a class Account with private properties accountNumber, balance, and ownerName. Provide public getter and setter methods for these properties. Implement a method deposit() to add money to the account and withdraw() to subtract money from the account, ensuring the balance doesn't go negative.
// Focus: Encapsulation and data hiding.

class Account{

    private static int accountSerialNo = 2024000;

    private final int accountNumber;
    private String userName;
    private float balance;



    // Constructors:
    public Account(){
        this.accountNumber = accountSerialNo++;
    }

    public Account(String userName){
        this();
        this.userName = userName;

    }

    public Account(String userName, float openingBalance) {
        this();
        this.userName = userName;
        this.balance = openingBalance;
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
        System.out.println("Transaction Summary: ");
        System.out.println(money + " credited to account: " + this.accountNumber + "\nAvailable Balance: "+this.balance);
        System.out.println();
        return 0;
    }
    
    public int withdraw(float money){
        System.out.println("Transaction Summary: ");
        if(money>this.balance){
            System.out.print("Insufficient ammount to make withdrawal!\nAvailable Balance: ");
            System.out.println(this.balance);
            System.out.println();
            return 1;
        }
        this.balance -= money;
        System.out.print(money + " debited from account: " + this.accountNumber + ".\nAvailable Balance: ");
        System.out.println(this.balance);
        return 0;
    }

    @Override
    public String toString() {
        return "\nAccount \n [ Account Number: " + accountNumber + " ]\n [ User Name: " + userName + " ]\n [ Available Balance: " + balance + "]\n";
    }
    
    
}

public class Q04_Encapsulation {
    public static void main(String[] args) {
        
        Account accObj1 = new Account("Chandra Sreas Gop", 5500);
        System.out.println(accObj1);

        Account accObj2 = new Account("Soutrika Das"); 
        System.out.println(accObj2);

        Account accObj3 = new Account();
        accObj3.setUserName("Sanjib Kumar Sah");
        accObj3.deposit(500);
        System.out.println(accObj3);


        accObj1.deposit(500);
        accObj1.withdraw(2000);
    }
}
