package SE3.Appointment;

import SE3.Maid.Maid;

import java.util.Calendar;
import java.util.Date;

public abstract class Adapter extends Appointment {
    private Calender calender;

    public Adapter() {
    }

    @Override
    public void createAppointment(Maid maid, Date date) {
        specifyType();
        Calendar cal = Calender.getCalendar();
        cal.setTime(date);
        System.out.println("Appointment is :"+cal.getTime() +" With " +maid.print());
    }

    public abstract void specifyType();


}
