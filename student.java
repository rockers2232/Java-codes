/*
Name			        :Anushka Sharma
Section			        :B
Class Roll Number	    :19
University Roll Number	:2023270
3.Create a class having functions to accept multiple students’ data and performing given operations.
Use the Scanner class to take student scores.
Calculate and display the final grade based on scores.
A school needs a program where students input their scores in 3 subjects, and the system calculates:
Total marks
Average percentage
Grade (A, B, C, D, or F)
 */
import java.util.Scanner;
public class student {
    double mark1;
    double mark2;
    double mark3;
    double per;

    student(double mark1,double mark2,double mark3)
    {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    void totalmarks()
    {
        double total=mark1+mark2+mark3;
        System.out.println("Total marks of student: "+total);
    }
    void avgpercentage()
    {
        per=((mark1+mark2+mark3)*100)/300;
        System.out.println("Percentage of student: "+per);
    }
    void grade()
    {
        if(per>=91&&per<=100)
        {
            System.out.println("Grade A");
        }
        else if(per>=81&&per<=90)
        {
            System.out.println("Grade B");
        }
        else if(per>=71&&per<=80)
        {
            System.out.println("Grade C");
        }
        else if(per>=61&&per<=70)
        {
            System.out.println("Grade D");
        }
        else
        {
           System.out.println("Grade F");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 3 subject: ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();

        student s= new student(x, y, z);
        s.totalmarks();
        s.avgpercentage();
        s.grade();

    }
    
}
