package come.codewithiqra;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar c =  Calendar.getInstance(); {

            System.out.println("Current Calender's Year:" + c.get(Calendar.YEAR));
            System.out.println("Current Calender's Day: " + c.get(Calendar.DATE));
            System.out.println("Current Minute: " + c.get(Calendar.MINUTE));
            System.out.println("Current Second: " + c.get(Calendar.SECOND));
            System.out.println("Current MILLISECOND:"+ c.get(Calendar.MILLISECOND));



        }
    }
}
