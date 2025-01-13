package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExamples {

    public static void main(String[] args) {


        // LocalDate: represents a date (year, month, and day) in ISO format (2022-02-05)
        var currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        //LocalTime: repesentts a time without date (hours, minutes, seconds and milliseconds)
        var currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        var currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        var specificDate = LocalDate.of(2023, 12, 25); // Christmas 2025
        var parseDate = LocalDate.parse("2022-05-05"); // "2022-05-05"
        var birthDate = LocalDate.parse("1998-02-05");
        System.out.println("Bday + 15 days = " + birthDate.plusDays(15));


        var lectureDate = LocalDate.parse("2025-01-13");
        System.out.println("ISO Date Format (default) = " + lectureDate);
        System.out.println("Formatted to BasicIsoFormat YYYYMMDD = " + lectureDate.format(DateTimeFormatter.BASIC_ISO_DATE));

        String custom = lectureDate.format(DateTimeFormatter.ofPattern("eeee dd MMM "));
        System.out.println("Custom Formatted Date: " + custom);
        //More formatting patterns in the docs

        //Period and Duration, measures the differences between two dates
    }
}
