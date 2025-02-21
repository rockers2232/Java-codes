import java.util.Scanner;

public class carray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int arr[],n;
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    
}
