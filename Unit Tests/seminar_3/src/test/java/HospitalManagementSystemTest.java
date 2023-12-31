import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HospitalManagementSystemTest {
    private Patient patient1;
    private Patient patient2;
    private Doctor doctor1;
    private Doctor doctor2;
    private Appointment appointment;
    private HospitalManagementSystem hospitalManagementSystem;

    @BeforeEach
    void setUp() {
        hospitalManagementSystem = new HospitalManagementSystem();
        patient1 = new Patient("Иван", "12345");
        patient2 = new Patient("Анна", "67890");
        doctor1 = new Doctor("Доктор Смит", "Кардиолог");
        doctor2 = new Doctor("Доктор Джонсон", "Хирург");
        appointment = new Appointment(doctor1, patient1, new Date());
    }

    @Test
    void addPatient() {
        List<Patient> patientList = new ArrayList<>(Collections.singletonList(patient1));
        hospitalManagementSystem.addPatient(patient1);
        //assertEquals(patientList,hospitalManagementSystem.getPatients());//Смутило сравнение экземпляров ЛИСТОВ с одинаковыми экземплярами
        assertArrayEquals(patientList.toArray(), hospitalManagementSystem.getPatients().toArray());
    }

    @Test
    void removePatient() {
        hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem.removePatient(patient1);
        assertFalse(hospitalManagementSystem.getPatients().contains(patient1));
    }

    @Test
    void getPatients() {
        List<Patient> patientList = new ArrayList<>(Arrays.asList(patient1, patient2));
        hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem.addPatient(patient2);
        assertArrayEquals(patientList.toArray(), hospitalManagementSystem.getPatients().toArray());
    }

    @Test
    void addDoctor() {
        List<Doctor> doctorList = new ArrayList<>(Arrays.asList(doctor1));
        hospitalManagementSystem.addDoctor(doctor1);
        assertArrayEquals(doctorList.toArray(), hospitalManagementSystem.getDoctors().toArray());

    }

    @Test
    void removeDoctor() {
        hospitalManagementSystem.addDoctor(doctor1);
        hospitalManagementSystem.removeDoctor(doctor1);
        assertTrue(!hospitalManagementSystem.getDoctors().contains(doctor1));
    }

    @Test
    void getDoctors() {
        List<Doctor> doctorList = new ArrayList<>(Arrays.asList(doctor1,doctor2));
        hospitalManagementSystem.addDoctor(doctor1);
        hospitalManagementSystem.addDoctor(doctor2);
        assertArrayEquals(doctorList.toArray(), hospitalManagementSystem.getDoctors().toArray() );

    }
    @Test
    void scheduleAppointment() {
        List<Appointment> appointmentList = new ArrayList<>(Arrays.asList(appointment));
        hospitalManagementSystem.scheduleAppointment(doctor1,patient1,new Date());
        assertArrayEquals(appointmentList.toArray(), hospitalManagementSystem.getAppointments().toArray());
    }

    @Test
    void getAppointments() {
        List<Appointment> appointmentList = new ArrayList<>();
        appointmentList.add(appointment);
        appointmentList.add(new Appointment(doctor2,patient1, new Date()));
        hospitalManagementSystem.scheduleAppointment(appointmentList.get(appointmentList.size()-1).getDoctor(), appointmentList.get(appointmentList.size()-1).getPatient(), new Date());
        assertArrayEquals(appointmentList.toArray(), hospitalManagementSystem.getAppointments().toArray());
    }
}

