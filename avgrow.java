import java.util.*;
class avgrow
{
    public static void main(String[] args)
    {
       int arr[][],r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        r=sc.nextInt();
        arr=new int[r][];
        for(int i=0;i<r;i++)
        {
            System.out.println("Enter columns of row "+(i+1)+" :");
            c=sc.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            int avg=0;
            for(int j=0;j<arr[i].length;j++)
            {
                avg=avg+arr[i][j];
            }
            System.out.println(avg/arr[i].length);
        }
    }
}