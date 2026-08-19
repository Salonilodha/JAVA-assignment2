import java.io.*;

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount()
    {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0;
    }

    BankAccount(int a, String n, double b)
    {
        accountNumber = a;
        accountHolderName = n;
        balance = b;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BankAccount b1 = new BankAccount();

        System.out.print("Enter Account Number: ");
        int no = Integer.parseInt(br.readLine());

        System.out.print("Enter Account Holder Name: ");
        String name = br.readLine();

        System.out.print("Enter Balance: ");
        double bal = Double.parseDouble(br.readLine());

        BankAccount b2 = new BankAccount(no, name, bal);

        System.out.println("\nAccount Details:");
        b2.displayAccount();

        System.out.print("Enter Deposit Amount: ");
        double d = Double.parseDouble(br.readLine());
        b2.deposit(d);

        System.out.print("Enter Withdraw Amount: ");
        double w = Double.parseDouble(br.readLine());
        b2.withdraw(w);

        System.out.println("\nUpdated Account:");
        b2.displayAccount();
    }
}
