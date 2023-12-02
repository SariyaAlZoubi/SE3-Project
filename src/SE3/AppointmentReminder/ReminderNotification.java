package SE3.AppointmentReminder;

public class ReminderNotification implements AppointmentReminder{

    @Override
    public void reminder() {
        System.out.println("Notification");
    }
}
