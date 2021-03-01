package Homework3;

public class Homework3 {
    public static void main(String[] args) {
        double fTemp;
        double cTemp=10.5;
        fTemp= cTemp * 9/5 + 32;
        System.out.println(fTemp);

        double kTemp;
        double cTemp1= 10;
        kTemp= cTemp1 + 273.15;
        System.out.println(kTemp);

        double fTemp2= 47;
        double cTemp2;
        cTemp2= (fTemp2- 32)* 5/9;
        System.out.println(cTemp2);

        double fTemp3= 12;
        double kTemp1;
        kTemp1= (fTemp3+ 459.67) * 5/9;
        System.out.println(kTemp1);

        double kTemp2= 20;
        double fTemp4;
        fTemp4= kTemp2 * 9/5 - 459.67;
        System.out.println(fTemp4);

        double kTemp3= 15;
        double cTemp3;
        cTemp3= kTemp3- 273.15;
        System.out.println(cTemp3);




    }
}
