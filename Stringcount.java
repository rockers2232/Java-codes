public class Stringcount {
    public static void main(String[] args) {
        String str="ababbcca";
        boolean b[]=new boolean[256];  
        for(char ch:str.toCharArray())
        {
            int c=0;
            if(b[ch])
            continue;
            for(char alpha:str.toCharArray())
            {
                if(ch==alpha)
                {
                    c++;
                    b[alpha]=true;
                }
            }
            System.out.println(ch+"="+c);
        }
    }
}
