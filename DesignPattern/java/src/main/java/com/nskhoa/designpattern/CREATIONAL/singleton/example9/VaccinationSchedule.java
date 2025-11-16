package com.nskhoa.designpattern.CREATIONAL.singleton.example9;

import java.util.HashMap;
import java.util.Map;

public class VaccinationSchedule {
    private static VaccinationSchedule instance;
    private Map<String, String> appointments = new HashMap<>();

    private VaccinationSchedule() {
    }

    public static VaccinationSchedule getInstance() {
        if (instance == null) {
            instance = new VaccinationSchedule();
        }
        return instance;
    }

    public void addAppointment(String person, String date) {
        appointments.put(person, date);
    }

    public Map<String, String> getAppointments() {
        return appointments;
    }

    public static void main(String[] args) {
        VaccinationSchedule schedule = VaccinationSchedule.getInstance();
        schedule.addAppointment("Alice", "2024-07-01");
        schedule.addAppointment("Bob", "2024-07-02");

        System.out.println("Vaccination Appointments: " + schedule.getAppointments());
    }
}
