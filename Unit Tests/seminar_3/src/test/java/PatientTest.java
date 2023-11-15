import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    Patient patient;

    @BeforeEach
    void setUp(){
        String name = "Bacя";
        String patientId = "1";
        patient = new Patient(name,patientId);
    }
    @Test
    @DisplayName("Тест создания клиента")
    void setPatientTest(){
        Patient patient = new Patient("Вася", "1");
        assertEquals("Вася", patient.getName());
        assertEquals("1", patient.getPatientId());
    }

    @Test
    void getName() {
        Patient patient = new Patient("Вася", "1");
        assertEquals("Вася", patient.getName());
    }

    @Test
    void getPatientId() {
        Patient patient = new Patient("Вася", "1");
        assertEquals("1", patient.getPatientId());
    }
}
