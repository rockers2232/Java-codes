import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:- ");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        System.out.println("1.term deposit 2.Recurring deposit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            double a=(p)*(1+(r/100))*t;
            System.out.println("Term Deposit: "+a);
            break;
            case 2:
            double b=(p*t)+p*(t*(t+1)/2)*(r/100)*1/12;
            System.out.println("Recurring Deposite: "+b);
            break;
            default:
            System.out.println("Invalid option");break;
        }
    }
}