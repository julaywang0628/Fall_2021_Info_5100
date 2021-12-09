package com.Northeastern.Zhilei;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws Exception {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter the year of driver's birthday(YYYY)");
        String strYear = object.nextLine();
        int year = Integer.parseInt(strYear);

        System.out.println("Enter the month of driver's birthday(MM)");
        String strMon = object.nextLine();
        int month = Integer.parseInt(strMon);

        System.out.println("Enter the day of driver's birthday(DD)");
        String strDay = object.nextLine();
        int day = Integer.parseInt(strDay);

        Date today = new Date();
        Date birth = new GregorianCalendar(year, month, day).getTime();

        try {
            int age = (int) (ChronoUnit.DAYS.between(birth.toInstant(), today.toInstant()) / 365);
            if(age < 16) {
                throw new Exception("The age of the applicant is " +age+" which is too early to apply for a driving license");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
