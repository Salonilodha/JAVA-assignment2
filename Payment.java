import java.io.*;

interface Payment
{
    void makePayment(double amount);
    void paymentDetails();
}

class CreditCardPayment implements Payment
{
    String cardNumber;
    String cardHolderName;
    double amount;

    CreditCardPayment(String no, String name)
    {
        cardNumber = no;
        cardHolderName = name;
    }

    public void makePayment(double amount)
    {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails()
    {
        System.out.println("Payment Mode: Credit Card");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Amount: Rs. " + amount);
    }
}

class UPIPayment implements Payment
{
    String upiId;
    String userName;
    double amount;

    UPIPayment(String id, String name)
    {
        upiId = id;
        userName = name;
    }

    public void makePayment(double amount)
    {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails()
    {
        System.out.println("Payment Mode: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("User Name: " + userName);
        System.out.println("Amount: Rs. " + amount);
    }
}

class CashPayment implements Payment
{
    String customerName;
    double amount;

    CashPayment(String name)
    {
        customerName = name;
    }

    public void makePayment(double amount)
    {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails()
    {
        System.out.println("Payment Mode: Cash");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: Rs. " + amount);
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----- PAYMENT SYSTEM -----");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");

        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(br.readLine());

        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(br.readLine());

        Payment p;

        if(choice == 1)
        {
            System.out.print("Enter Card Number: ");
            String no = br.readLine();

            System.out.print("Enter Card Holder Name: ");
            String name = br.readLine();

            p = new CreditCardPayment(no, name);
        }
        else if(choice == 2)
        {
            System.out.print("Enter UPI ID: ");
            String id = br.readLine();

            System.out.print("Enter User Name: ");
            String name = br.readLine();

            p = new UPIPayment(id, name);
        }
        else if(choice == 3)
        {
            System.out.print("Enter Customer Name: ");
            String name = br.readLine();

            p = new CashPayment(name);
        }
        else
        {
            System.out.println("Invalid Choice");
            return;
        }

        p.makePayment(amount);
        p.paymentDetails();
    }
}
