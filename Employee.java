import java.io.*;

abstract class Employee
{
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int id, String name, double salary)
    {
        employeeId = id;
        employeeName = name;
        basicSalary = salary;
    }

    abstract double calculateSalary();

    void display()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee
{
    PermanentEmployee(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    double calculateSalary()
    {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.40;
        double pf = basicSalary * 0.12;

        double gross = basicSalary + hra + da;
        double net = gross - pf;

        return net;
    }
}

class ContractEmployee extends Employee
{
    ContractEmployee(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    double calculateSalary()
    {
        return basicSalary + (basicSalary * 0.10);
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name: ");
        String name = br.readLine();

        System.out.print("Enter Basic Salary: ");
        double salary = Double.parseDouble(br.readLine());

        Employee e1 = new PermanentEmployee(id, name, salary);

        System.out.println("\nPermanent Employee");
        e1.display();
        System.out.println("Net Salary: " + e1.calculateSalary());

        Employee e2 = new ContractEmployee(id, name, salary);

        System.out.println("\nContract Employee");
        e2.display();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
