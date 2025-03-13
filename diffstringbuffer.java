public class diffstringbuffer {
    public static void main(String[] args) {
        String str="Hello";
        str.concat("World");//here original doesn't get affect
        System.out.println(str);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");//here original get affected
        System.out.println(sb);
    }
    
}
