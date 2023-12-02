package SE3.AppointmentReminder;

public class SoundReminder implements AppointmentReminder{
    @Override
    public void reminder() {
        System.out.println("Sound");
    }
}
