package com.nskhoa.designpattern.STRUCTURAL.facade.example7;

class PatientRecords {
    void manageRecords() { System.out.println("Managing patient records"); }
}

class AppointmentScheduler {
    void scheduleAppointments() { System.out.println("Scheduling appointments"); }
}

class MedicalHistoryManager {
    void manageHistory() { System.out.println("Managing medical history"); }
}

class HealthcareFacade {
    private PatientRecords records = new PatientRecords();
    private AppointmentScheduler scheduler = new AppointmentScheduler();
    private MedicalHistoryManager history = new MedicalHistoryManager();

    void managePatientCare() {
        records.manageRecords();
        scheduler.scheduleAppointments();
        history.manageHistory();
    }
}

public class Client {
    public static void main(String[] args) {
        HealthcareFacade facade = new HealthcareFacade();
        facade.managePatientCare();
    }
}
