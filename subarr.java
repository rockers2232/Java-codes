public class subarr {
    public static void main(String[] args) {
        int arr[]={1, -2, 3, 4, -1, 2, 1, -5, 4};
        int max=0,sum=0,s=0,f=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum>max)
                {
                    max=sum;
                    s=i;
                    f=j;
                }
            }
        }
        System.out.println(max);
        for(int i=s;i<=f;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
