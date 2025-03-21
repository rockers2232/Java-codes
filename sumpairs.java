import java.util.Arrays;
public class sumpairs {

    void arrayFunc(int[]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(x+arr[j]==target)
                {
                    System.out.println(x+","+arr[j]);
                }
            }
        }
    }

    void arrayFunc(int[]arr1,int m,int[]arr2,int n)
    {
        int arr3[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=m,j=0;i<m+n;i++,j++)
        {
            arr3[i]=arr2[j];
        }
        Arrays.sort(arr3);
        for(int i=0;i<m;i++)
        {
            arr1[i]=arr3[i];
        }
        for(int i=m,j=0;i<m+n;i++,j++)
        {
            arr2[j]=arr3[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int arr[]={4,6,5,-10,8,5,20};
        int target=10;

        sumpairs s=new sumpairs();
        s.arrayFunc(arr,target);

        int arr1[]={1,5,6,7,8,10};
        int arr2[]={2,4,9};
        s.arrayFunc(arr1,arr1.length,arr2,arr2.length);
    }
    
}
