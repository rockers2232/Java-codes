import java.util.*;
class array
{
    public static void main(String[] args)
    {
       int arr[],r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        r=sc.nextInt();
        arr=new int[r];
        for(int i=0;i<r;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<r;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}