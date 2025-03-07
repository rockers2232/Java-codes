import java.util.Scanner;
import java.util.Arrays;
 class lunchbox {
    public static void main(String[] args) {
        int t,tiffin,school,arr[];
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            tiffin=sc.nextInt();
            school=sc.nextInt();
            arr=new int[school];
            for(int j=0;j<school;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));
            int c=0;
            for(int k=0;k<school;k++)
            {
                    tiffin=tiffin-arr[k];
                if(tiffin>=0)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
