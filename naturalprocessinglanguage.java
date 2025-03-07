import java.util.Scanner;
class naturalprocessinglanguage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases: ");
        int x=sc.nextInt();
        sc.nextLine();
        int c=0;
        for(int y=0;y<x;y++)
        {
            System.out.println("Enter test case "+(y+1)+":");
            String str=sc.nextLine();
            c=0;
            for(int i=-1;i<str.length()-2;i++)
            {
                String s="";
                for(int j=i+1;j<str.length();j++)
                {
                    s=s+str.charAt(j);
                    //System.out.println(s);
                    s.toLowerCase();
                    for(int k=0;k<s.length();k++)
                    {
                         if(s.charAt(k)=='a'||s.charAt(k)=='e'||s.charAt(k)=='i'||s.charAt(k)=='o'||s.charAt(k)=='u')
                        {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}