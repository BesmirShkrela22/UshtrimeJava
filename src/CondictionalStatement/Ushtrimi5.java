package CondictionalStatement;


import java.util.Scanner;

public class Ushtrimi5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jepni numrin e dites");
        int day = scanner.nextInt();
        System.out.println("eshte dite e ;"+getdayname(day));
    }

    public static String getdayname(int day) {
        String dayname = "";

        switch (day) {
            case 1:
                dayname = "monday";
                break;
            case 2:
                dayname = "twesday";
                break;
            case 3:
                dayname = "wensday";
                break;
            case 4:
                dayname = "thursday";
                break;
            case 5:
                dayname = "friday";
                break;
            case 6:
                dayname = "saturday";
                break;
            case 7:
                dayname = "subday";
                break;
            default:
                System.out.println("numer i gabuar");




        }

return dayname;
    }

}