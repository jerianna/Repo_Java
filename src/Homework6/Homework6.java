package Homework6;

import com.sun.codemodel.internal.JSwitch;

import java.util.Locale;

public class Homework6 {
    public static void main(String[] args) {
        /**
         * checking car mode (P,D,N,R)  //switch
         * if car mode is P --> print "you can park the car"
         * if car mode is D --> print "drive car"
         *  if drive type is snow --> print "you are on snow mode"
         *  if drive type is sports --> print " you are on sports mode"
         *  if drive type is eco --> print " you are on eco mode"
         *  if car mode is n --> print "put car in car wash"
         *  if car mode is r --> print "return car"
         */
        char carGear= 'P';
        String driveType= "sport";

        switch(carGear) {
            case 'P':
                System.out.println("you can park the car");
            break;
            case 'D':
                System.out.println(driveType);
            break;}
                switch(driveType.toLowerCase()) {
                    case "snow":
                        System.out.println("you are on snow mode");
                    break;
                    case "sport":
                        System.out.println(" you are on sports mode");
                    break;
                    case "Eco":
                        System.out.println(" you are on eco mode");
                    break; }
            switch(carGear) {
                    case'N':
                        System.out.println("put car in car wash");
                    break;
                case 'R':
                    System.out.println("reverse car");
                    break;
                default:
                    System.out.println("invalid car gear" + carGear);

        }
    }








}
