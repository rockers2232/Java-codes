class maxocc
{
    public static void main(String[] args) {
        int arr[]={1,4,1,4,3,6,7,4};
        boolean f[]=new boolean[arr.length];
        int max=0;
        int element=-1;
        for(int i=0;i<arr.length;i++)
        {
            int c=1;
                if(f[i])
                continue;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    f[j]=true;
                }
            }
            if(c>max)
            {
                max=c;
                element=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(element);
    }
}