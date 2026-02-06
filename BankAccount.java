public class BankAccount
{
    private String gmail;
    private String accountNumber;           //PROPERTIES
    private double balance = 30000;

    public BankAccount(String number,String gmail)       //CONSTRUCTOR
    {
        this.accountNumber = number;
        this.gmail = gmail;
    }
    public void deposit(double amount)      //METHOD 1
    {

        System.out.println("You deposit an amount of Php = " + amount);
        balance += amount;
    }
    public void withdraw(double amount) // METHOD 2
    {
        amount = 13000;
        if(amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("You withdraw an amount of Php = " + amount);
            balance -= amount;
        }
    }

    public double getBalance()      //METHOD 3
    {
        return balance;
    }
    public String get_Number()      // METHOD 4
    {
        return accountNumber;
    }
    public String get_Gmail()       //METHOD 5
    {
        return gmail;
    }

    public void displayInfo()
    {
        deposit(25000);
        withdraw(13000);
        System.out.println("Balance: " + getBalance());
        System.out.println("Account number: " + get_Number());
        System.out.println("Gmail Account: " + get_Gmail());
    }

    public static void main(String[] args)
    {
        BankAccount client = new BankAccount("09158333240","codealpha@gmail.com");
        client.displayInfo();
    }
}