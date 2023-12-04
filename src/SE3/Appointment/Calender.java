package SE3.Appointment;

import java.util.Calendar;

public class Calender {
    private static final Calendar cal = Calendar.getInstance();

    private Calender() {
    }

    public static Calendar getCalendar() {
        return cal;
    }
}
