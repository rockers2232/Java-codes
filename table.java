import java.util.*;
class table
{
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        x=sc.nextInt();
        outer:for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(j>i)
                {
                    System.out.println();
                    continue outer;
                }
                System.out.print((i*j)+" ");
            }
        }
    }
}