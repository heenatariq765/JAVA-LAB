/* Hospital Management System
Create a base class Patient:
patientId → private
disease → protected
getDetails() → public
Create subclass DoctorAccess:
Can view disease
Cannot directly access patientId
Must use method to access ID
Demonstrate access control clearly*/

class Patient{
    private int patient_Id;
    protected String disease;

    public Patient(int id, String dis) {
        patient_Id = id;
        disease = dis;
    }

    public String getDetails() {
        return "Patient ID: " + patient_Id ;
    }
}

class DoctorAccess {
    public void viewPatientDetails(Patient patient) {
        System.out.println(patient.getDetails());
   
        System.out.println("Disease: " + patient.disease);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Patient patient = new Patient(100, "Flu");
        DoctorAccess doctor = new DoctorAccess();
        doctor.viewPatientDetails(patient);
    }
}