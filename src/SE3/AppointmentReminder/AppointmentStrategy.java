package SE3.AppointmentReminder;

import SE3.Appointment.Appointment;

public class AppointmentStrategy {

        private AppointmentReminder appointmentReminder;

        public  AppointmentStrategy(AppointmentReminder appointmentReminder) {
            this.appointmentReminder = appointmentReminder;
        }

        public void performPayment(Appointment appointment) {
            appointmentReminder.reminder(appointment);
        }

}
