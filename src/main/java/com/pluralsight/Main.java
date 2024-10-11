package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        System.out.println("Dates");
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");
        System.out.println(today.format(fmt1));
        System.out.println(today.format(fmt2));
        System.out.println(today.format(fmt3));
        System.out.println(today.format(fmt4));
        System.out.println(today.format(fmt5));
        // E = Mon
        // EEEE = Monday
        // MM = 10
        // MMM OCT
        // MMMM = October

        System.out.println("Today is: " + today);
            // Specify the date/time format you will want to use DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
            // String formattedDate = today.format(fmt);
            // System.out.println("Today is: " + formattedDate); } }



    }
}