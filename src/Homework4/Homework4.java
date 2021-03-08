package Homework4;

public class Homework4 {
    public static void main(String[] args) {
        String myName= "jerianna";
        int nameLength= myName.length();
        int length=5;
        String myChar= nameLength > length ? "j" : "a";




        String sentence_3 = "hello dear, how are you?";
        boolean trueOrFalse = sentence_3.length()> 10 ? true : false;
        System.out.println("is hello world gr 10:"+ trueOrFalse);


        /**
         * sentence_4= "We all ARe Good ProgROmmer"
         * sentence_4InLowerCase= "we are all good progrommer"
         */
        String sentence_4= "We all ARe Good ProgROmmer";
        boolean isEqualIgnoreCase= sentence_4.equalsIgnoreCase();







    }
}
