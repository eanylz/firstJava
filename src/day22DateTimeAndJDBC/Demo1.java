package day22DateTimeAndJDBC;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Demo1 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        LocalDate dat = LocalDate.now();
        System.out.println(dat);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate localDate= LocalDate.of(1991,12,15);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.of(2001,02,12,11,33,11);
        System.out.println(localDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = formatter.format(localDate);
        System.out.println(formattedDate);
    }
}
