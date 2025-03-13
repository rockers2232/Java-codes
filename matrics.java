public class matrics {

    void displaymatrix(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        {
            int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};
            int mat2[][]={{10,11,12},{13,14,15},{16,17,18}};
            int mat3[][]=new int[3][3];
            for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat2.length;j++)
                {
                    int sum=mat1[i][j]+mat2[i][j];
                    mat3[i][j]=sum;
                }
            }
            matrics m=new matrics();
            m.displaymatrix(mat3);

            for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat1.length;j++)
                {
                    mat3[i][j]=mat1[j][i];
                }
            }
            
            matrics m1=new matrics();
            m1.displaymatrix(mat3);
            int sum1=0;
            for(int i=0;i<mat1.length;i++)
            {
                for(int j=0;j<mat1.length;j++)
                {
                    if(i==j||i+j==2)
                    {
                        sum1=sum1+mat1[i][j];
                        System.out.print(mat1[i][j]+" ");
                    }

                }
            }
            System.out.println(sum1);
        }
    }
}
