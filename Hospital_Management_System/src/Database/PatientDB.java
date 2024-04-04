package Database;

import Model.Interfaces.Patient;

import java.util.HashMap;

public class PatientDB {
    HashMap<String, Patient> patientDetails;
    public PatientDB(){
        patientDetails = new HashMap<>();
    }

    public int getTotalPatient(){
        return patientDetails.size();
    }

    public Patient getPatient(String pid){
        return patientDetails.get(pid);
    }
    public void addPatient(Patient p){
        String pid = p.pId();
        patientDetails.put(pid, p);
        System.out.println("New Patient got added into db");
    }
    public Patient getPatientByID(String pId){
        return patientDetails.get(pId);
    }
}
