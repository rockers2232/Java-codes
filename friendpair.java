import java.util.Scanner;

public class friendpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.'s:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0)
            {
                sum2=sum2+i;
            }
        }
        if((sum1==a)&&(sum2==b))
        System.out.println("Abundant no.");
        else
        System.out.println("Not a Abundant no.");
    }
    
}
