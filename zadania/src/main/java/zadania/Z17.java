package zadania;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class Z17 {
    public static void main(String[] args) {
        System.out.println(isAdult("03250900000"));
    }

    public static boolean isAdult(String pesel){
        if(pesel == null){
            throw new IllegalArgumentException("PESEL cannot be null");
        }
        if(pesel.length() != 11 || pesel.codePoints().anyMatch(x -> x < '0' || x > '9')){
            throw new IllegalArgumentException("Invalid format of PESEL");
        }

        String year = pesel.substring(0, 2);
        String month = pesel.substring(2, 4);
        String day = pesel.substring(4, 6);

        int intDay = Integer.parseInt(day);
        int intMonth = Integer.parseInt(month);
        int intYear;
        if(intMonth > 0 && intMonth < 13){
            intYear = 1900 + Integer.parseInt(year);
        } else if(intMonth > 20 && intMonth < 33){
            intYear = 2000 + Integer.parseInt(year);
            intMonth -= 20;
        } else if(intMonth > 80 && intMonth < 93){
            intYear = 1800 + Integer.parseInt(year);
            intMonth -= 80;
        } else {
            throw new IllegalArgumentException("Invalid month number");
        }

        LocalDate date;
        try {
            date = LocalDate.of(intYear, intMonth, intDay);
            System.out.println(date);
        } catch (DateTimeException e){
            throw new IllegalArgumentException("Invalid date format: " + e.getMessage());
        }

        return Period.between(date, LocalDate.now()).getYears() >= 18;
    }
}
