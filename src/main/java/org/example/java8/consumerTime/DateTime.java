package org.example.java8.consumerTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTime {
    static public void run(){
        LocalDate d = LocalDate.now();

        System.out.println(d);
        LocalDate dOf = LocalDate.of(2008,5,7);
        System.out.println(dOf);
        LocalDate  dOfPlusTwo= dOf.plusDays(2).plusYears(2);
        System.out.println("After add"+dOfPlusTwo);

        Period period = Period.between(dOf, dOfPlusTwo);
        System.out.println("Period "+ period);

        LocalDateTime dtCanada = LocalDateTime.now(ZoneId.of("Canada/Saskatchewan"));


        for (String id : ZoneId.getAvailableZoneIds()){
            System.out.println(id);
        }


        System.out.println( "Canada Time" + dtCanada);
        LocalDateTime dtMy = LocalDateTime.now();
        System.out.println("Ukraine Time" + dtMy);

   //     Period

   //             Duration
        //date time formator

    }
}
