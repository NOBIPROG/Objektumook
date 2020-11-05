package KarakterekaStringben;

public class oraifeladatok20201004 {
    public static void main(String[] args) {
        String s = "4 alma béla 4 3!%";
        System.out.println(s + "-ben: ");
        countLetters(s);
        firstNNumsUniCodeChar(1000);
        nUniCodeChar(65);
        isAlphaNumericChar('?');
        getOccuringChar("allmma");

    }

    public static void countLetters(String st) {
        int letter = 0;
        int space = 0;
        int nums = 0;
        int specCha = 0;


        for (int i = 0; i < (st.length()); i++) {
            char location = st.charAt(i);
            if (Character.isLetter(location)) {
                letter++;
            } else if (Character.isDigit(location)) {
                nums++;
            } else if (Character.isDigit(location)) {
                nums++;
            } else if (Character.isWhitespace(location)) {
                space++;
            } else specCha++;

        }
        System.out.println("Betű: " + letter + " " + "Space: " + space + " " + "Számok: " + nums + " " + "Speciális karakter: " + specCha + " található..");
    }

    public static void firstNNumsUniCodeChar(int num) {
        char chars = ' ';
        for (int i = 0; i < num; i++) {
            chars = (char) i;
            System.out.println(chars + "-" + i);

        }

    }

    public static void nUniCodeChar(int num) {
        char chars = (char) num;

        System.out.println(num + ". Karakter: " + chars);
    }

    public static void isAlphaNumericChar(char c) {
        boolean isAlphanum = Character.isDigit(c) || Character.isLetter(c);
        if (isAlphanum) {
            System.out.println("Igen");

        } else System.out.println("Nem");
    }
    public static String Ceasar(String message, int num){
        StringBuilder result= new StringBuilder();
       for (char character: message.toCharArray()){
           if (character!=' '){

           }
       }
        return String.valueOf(result);
    }
    public static void getOccuringChar(String s)
    {
        int [] count = new int[256];

        for(int i=0; i<s.length(); i++)
        {
            count[s.charAt(i)]++;
        }


        boolean [] bool = new boolean[256];

        for(int i=0; i<s.length(); i++)
        {
            if(!bool[s.charAt(i)]){
                bool[s.charAt(i)] = true;
                System.out.println(s.charAt(i)+" : "+count[s.charAt(i)]);
            }

        }
    }
}



