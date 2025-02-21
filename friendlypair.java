import java.util.Scanner;

public class friendlypair {
    public static void main(String[] args) {
        int num1,num2,sum1=0,sum2=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the two no.: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        for(int i=1;i<=num1/2;i++)
        {
            if(num1%i==0)
            sum1=sum1+i;
        }
        for(int i=1;i<=num2/2;i++)
        {
            if(num2%i==0)
            sum2=sum2+i;
        }
        if((sum1==num1)&&(sum2==num2))
        System.out.println("Abundant no.");
        else
        System.out.println("Not Abundant no.");
    }
    
}
