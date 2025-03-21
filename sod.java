/*
Name			        :Anushka Sharma
Section			        :B
Class Roll Number	    :19
University Roll Number	:2023270
4.	Write a java program to calculate the sum of digits of a number using a do-while loop. 
Take user input for the number and display the sum.
 */
import java.util.Scanner;;
public class sod {
    public static void main(String[] args) {
        int x,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=sc.nextInt();
        do{
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
        }while(x!=0);
        System.out.println("Sum of digits are: "+sum);
    }
}
