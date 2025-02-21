import java.util.*;
class arrayd
{
    public static void main(String[] args)
    {
       int arr[][],r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        r=sc.nextInt();
        c=sc.nextInt();
        arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}