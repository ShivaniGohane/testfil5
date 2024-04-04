package Database;

import Model.Interfaces.Doctor;
import Model.Interfaces.Patient;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {
    HashMap<String, Doctor> docDetails;
    HashMap<String, ArrayList<Patient>> docVsPatient;
    public DoctorDB(){
        docDetails = new HashMap<>();
        docVsPatient = new HashMap<>();
    }
    //HSP2
    public Doctor getDoctorByID(String docID){
        return docDetails.get(docID);
    }

    public int getTotalDocs(){
        return docDetails.size();
    }
    public ArrayList<Patient> getAssignedPatient(String docId){
        return docVsPatient.get(docId);
    }
    public Doctor assignPatientToDoctor(Patient p){
        String docId = "";
        int min = Integer.MAX_VALUE; //which doctor is handling minimum patient
        for(String docIds : docVsPatient.keySet()){
            if(min > docVsPatient.get(docIds).size()){
                min = docVsPatient.get(docIds).size();
                docId = docIds;
            }
        }

        ArrayList<Patient> allPatient = docVsPatient.get(docId);
        allPatient.add(p);

        return docDetails.get(docId);
    }
    public void addDoctorToDB(Doctor d){
        String docId = d.docId();
        docDetails.put(docId, d);
        docVsPatient.put(docId, new ArrayList<>());
        System.out.println("New doctor got added into Doctor Database with docid -> "+docId);
    }
}
