package Homework4;

public class Homework4 {
    public static void main(String[] args) {

String sentence_3 = "hello dear, how are you";
int sentence_3length = sentence_3.length();
boolean isStart = sentence_3length > 10 ? true : false;
        System.out.println("is\n" + sentence_3 + "\nlength" + "\n" +sentence_3length + "\n" +isStart);


String sentence_4 = "We all ARe Good Programmers";
String sentence_4LowerCase = sentence_4.toLowerCase();
String sentence_4Replace_r_f = sentence_4.replace("r","f");
String sentence_4Replace_R_f = sentence_4.replace("R","f");
        System.out.println(sentence_4 + "\n" +sentence_4LowerCase+ "\n" + sentence_4Replace_r_f);
        System.out.println(sentence_4LowerCase + "\n" + sentence_4Replace_r_f + "\n"+ sentence_4Replace_R_f);


String fullName = "Jerianna Gottschalk";
int fullNameLength = fullName.length();
String fullNameLowerCase = fullName.toLowerCase();
        System.out.println(fullName + "\n"  + fullNameLowerCase + "\n" + fullNameLength);
boolean isStartWith_K = fullNameLowerCase.startsWith("K");
        System.out.println(fullNameLowerCase + "\n"+ fullNameLowerCase.startsWith("K"));
boolean isContains_a = fullName.contains("a");
        System.out.println(fullName + "\n" + isContains_a);



    }
}
