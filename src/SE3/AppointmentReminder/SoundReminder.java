package SE3.AppointmentReminder;

import SE3.Appointment.Appointment;

public class SoundReminder implements AppointmentReminder{
    @Override
    public void reminder(Appointment appointment) {
        System.out.println("Sound");
    }
}
