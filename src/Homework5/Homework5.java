package Homework5;

import java.util.Locale;

public class Homework5 {
    public static void main(String[] args) {

        String fullName = "Jerianna Gottschalk";
        int fullNameLength = fullName.length();
        System.out.println("full name is"+fullName+ fullName.length());
        String fullName_LowerCase= fullName.toLowerCase();
        boolean isStartsWith_k= fullName.startsWith("k");
        System.out.println("is full name starts with k"+ fullName+ fullName.startsWith("k"));
        String lastName= "Gottschalk";
        String lastName_LowerCase= lastName.toLowerCase();
        boolean isContains_a = lastName_LowerCase.contains("a");
        System.out.println("is last name contains a"+ lastName+ lastName_LowerCase.contains("a"));

       String lastName_1= "gottschalk";
       if (lastName_1.equals("gottschalk"));
       else lastName_1.equals("a");
        System.out.println("last name equals"+ lastName_1 + lastName_1.equals("a"));

        String threeWordSentence_1= "hapPY nEW yeAr";
        System.out.println(threeWordSentence_1); //hapPY nEW yeAr
        String threeWordSentence_LowerCase= threeWordSentence_1.toLowerCase();
        System.out.println(threeWordSentence_LowerCase);

        String threeWordSentence_1_hH= threeWordSentence_1.replace("h","H");
        String threeWordSentence_1_nN= threeWordSentence_1.replace("n","N");
        String threeWordSentence_1_yY= threeWordSentence_1.replace("y","Y");



    }
}
