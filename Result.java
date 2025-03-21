interface countP {
    void countPalindrome(String s);
}

class Result implements countP {
    public void countPalindrome(String s) {

        String[] str=s.split(" +");
        int count=0;
        for(String ch:str)
        {
            int left=0,right=ch.length()-1;
                if(ch.charAt(left)==ch.charAt(right))
                {
                    count++;
                    //System.out.println(ch);
                }
            
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String s = "madam racecar apple level noon";
        Result obj = new Result(); 
        obj.countPalindrome(s); 
    }
}
