package SE3.AppointmentReminder;

import SE3.Appointment.Appointment;

public class ReminderNotification implements AppointmentReminder{

    @Override
    public void reminder(Appointment appointment) {
        System.out.println("Notification");
    }
}
