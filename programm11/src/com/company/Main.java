package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkIP(String IpAdress)
    {
        String regular  = "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])" + "\\."
                + "(\\d{1,2}|([01])\\" + "d{2}|2[0-4]+\\d|25[0-5])";

        Pattern pattern = Pattern.compile(regular );
        Matcher match= pattern.matcher(IpAdress);
        return match.matches();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String IpAdress = scanner.nextLine();

        System.out.println("IPadress: "+checkIP(IpAdress));

    }

}
