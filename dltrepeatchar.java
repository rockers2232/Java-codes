public class dltrepeatchar {
    public static void main(String[] args) {
        String str="aabbcdbeeff";
        char s[]=str.toCharArray();
        boolean b[]=new boolean[256];
        int index=0;
        for(int i=0;i<s.length;i++)
        {
            if(!b[s[i]])
            {
                b[s[i]]=true;
                s[index]=s[i];
                index++;
            }
        }
        System.out.println(new String(s, 0, index));
    }
}
