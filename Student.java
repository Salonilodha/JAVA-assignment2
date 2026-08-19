import java.io.*;

class Student
{
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    void accept() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Roll No: ");
        rollNo = Integer.parseInt(br.readLine());

        System.out.print("Enter Name: ");
        name = br.readLine();

        System.out.print("Enter Marks 1: ");
        marks1 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks 2: ");
        marks2 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks 3: ");
        marks3 = Integer.parseInt(br.readLine());
    }

    int total()
    {
        return marks1 + marks2 + marks3;
    }

    double percentage()
    {
        return total() / 3.0;
    }

    void result()
    {
        double p = percentage();
        String grade;

        if(p >= 90)
            grade = "A+";
        else if(p >= 80)
            grade = "A";
        else if(p >= 70)
            grade = "B";
        else if(p >= 60)
            grade = "C";
        else if(p >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + percentage());
        System.out.println("Grade: " + grade);
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter Student 1 Details");
        s1.accept();

        System.out.println("\nEnter Student 2 Details");
        s2.accept();

        System.out.println("\n--- Student 1 Result ---");
        s1.result();

        System.out.println("\n--- Student 2 Result ---");
        s2.result();
    }
}
