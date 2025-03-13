public class stringbuffer {

    String delete_vowel(String str)
    {
        return str.replaceAll("[AEIOUaeiou]","");
    }

String delete_vowelbuffer(String s)
{
    StringBuffer vb=new StringBuffer();
    for(char ch:s.toCharArray())
    {
        if(!"[AEIOUaeiou]".contains(String.valueOf(ch)))
        {
            vb.append(ch);
        }
    }
    return vb.toString();
}
    public static void main(String[] args) {
        String str="Ayush";
        stringbuffer sb=new stringbuffer();
        str=sb.delete_vowel(str);
        String s="Hello";
        s=sb.delete_vowelbuffer(s);
        System.out.println(str);
        System.out.println(s);
    }
}
