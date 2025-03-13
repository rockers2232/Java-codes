
public class countarr {
    public static void main(String[] args) {
        int arr[]={1,5,1,2,2,5,3};
        boolean visit[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int c=1;
              if(visit[i])
                continue;
            for(int j=i+1;j<arr.length;j++)
            {
                
                    if(arr[i]==arr[j])
                    {
                        c++;
                        visit[j]=true;
                    }
                
            }
            
            System.out.println(arr[i]+"="+c);
        }
        int l=arr[0];
        int sl=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl&&arr[i]!=l)
            {
                sl=arr[i];
            }
        }
        System.out.println(sl);
    }
    
}
