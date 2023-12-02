package SE3.Calender;

import java.util.Calendar;
import java.util.Date;

public class Adapter implements Appointment {
    private Calender calender;

    public Adapter() {
    }
    @Override
    public void appointment(Date date) {
        Calendar cal = Calender.getCalendar();
        cal.setTime(date);
        System.out.println("Appointment is :"+cal.getTime());

    }
}
