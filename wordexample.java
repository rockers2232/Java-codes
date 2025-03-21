public class wordexample {
    String strdata;

    wordexample(String strdata)
    {
        if(!strdata.endsWith(".")&&!strdata.endsWith("?")&&!strdata.endsWith("!"))
        {
            this.strdata=strdata.trim();
        }
        System.out.println("Enter valid sentence");
    }

    void countword()
    {
        String words[]=strdata.split(" +");
        int count=0;
        for(String word:words)
        {
            if(isVowel(word.charAt(0))&&isVowel(word.charAt(word.length()-1)))
            count++;
        }
        System.out.println("No. of begin and end with vowel : "+count);
    }

        void placeword()
        {
            String words[]=strdata.split(" +");
            String v="";
            String nv="";
            for(String word:words)
            {
                if(isVowel(word.charAt(0))&&isVowel(word.charAt(word.length()-1)))
                {
                    v=v+word+" ";
                }
                else
                {
                    nv=nv+word+" ";
                }
            }
            String join=v+nv;
            System.out.println(join.trim());
        }
        
        boolean isVowel(char ch)
        {
            return "AEIOUaeiou".contains(String.valueOf(ch));
        }

        public static void main(String[] args) {
            String str="I am An Elephante";
            wordexample w= new wordexample(str);
            w.countword();
            w.placeword();
        }
}

