package com.hank.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(
                2020,4,17,2,30,0);
        LocalDateTime leave = LocalDateTime.of(
                2020,4,17,5,50,0);
        Car car = new Car("ABC-4987",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60.0); //Math.ceil取天花板
        System.out.println(hours);
        System.out.println(hours*30);

//        java8();
//        java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3))); //加3小時
//        System.out.println(formatter.format(now.plus(Duration.ofHours(3))));
        LocalDateTime other =
                LocalDateTime.of(2020,5,20,5,20);
        System.out.println(other);
//        System.out.println(formatter.format(other));
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2020/4/20 5:20:00";
        Date other = null;
        try {
            other = sdf.parse(s);
            /*Date other = sdf.parse(s);
            System.out.println(other);*/
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(other);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,4); //0為一月
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
