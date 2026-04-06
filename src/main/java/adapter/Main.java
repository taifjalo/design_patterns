package adapter;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        NewDateInterface adapter = new CalendarToNewDateAdapter(calendar);

        
        // Step 1: Calendar Class Set initial date to July 1, 2023 using Calendar and then use the adapter to manipulate it
        calendar.set(2023, Calendar.JULY, 1); // Set initial date to July 1, 2023
        System.out.println("Initial Date: " + calendar.getTime());


        // Step 2: Calendar Adapter Class Update the calendar's internal state
        adapter.setDay(15);
        adapter.setMonth(8);
        adapter.setYear(2023);
        System.out.println("Current Date: " + adapter.getDay() + "/" + adapter.getMonth() + "/" + adapter.getYear());

        // Step 3: Calendar Adapter Class Advance the date by 10 days
        adapter.advanceDays(10);
        System.out.println("Date after advancing 10 days: " + adapter.getDay() + "/" + adapter.getMonth() + "/" + adapter.getYear());
    }
}
