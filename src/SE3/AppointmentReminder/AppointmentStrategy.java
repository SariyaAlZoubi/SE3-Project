package SE3.AppointmentReminder;

public class AppointmentStrategy {

        private AppointmentReminder appointmentReminder;

        public  AppointmentStrategy(AppointmentReminder appointmentReminder) {
            this.appointmentReminder = appointmentReminder;
        }

        public void performPayment() {
            appointmentReminder.reminder();
        }

}
