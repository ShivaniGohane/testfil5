package Model;

import Database.DoctorDB;
import Database.PatientDB;
import Model.Interfaces.Doctor;
import Model.Interfaces.Patient;

public class Hospital {
    
    private String hospitalName;
    private int totalBeds;

    private String hospitalAddress;
    private int hospitalPhoneNumber;
    DoctorDB doctorsDatabase;
    PatientDB patientsDatabase;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
        doctorsDatabase = new DoctorDB();
        patientsDatabase = new PatientDB();
    }

    public void getHospitalName(){
        System.out.println(hospitalName);
    }
    public void getTotalBeds(){
        System.out.println(totalBeds);
    }
    public void getHospitalAddress(){
        System.out.println(hospitalAddress);
    }
    public void getHospitalPhoneNumber(){
        System.out.println(hospitalPhoneNumber);
    }
    public void getTotalPatientAvailable(){
        System.out.println(patientsDatabase.getTotalPatient());
    }
    public void getTotalDoctors(){
        System.out.println(doctorsDatabase.getTotalDocs());
    }
    public void getPatientDetails(String pId){
        Patient p = patientsDatabase.getPatientByID(pId);
        p.getMyDetails();
    }
    public void getDoctorDetails(String docId){
        Doctor d = doctorsDatabase.getDoctorByID(docId);
        d.getMyDetails();
    }
    //if you are using reference of child think with specs of child only
    //if you are using ref of parent then think with specs of parent
    //parent class -> child class ref obj is child -> ref you can access child method but you cant access child properties
    // Parent Interface -> Child is class -> ref as parent interface -> child properties as well child method you can just access what ever method that are implement method

    public void admitPatient(String patientName, String patientIllness, int patientAge, String patientGender){
        String pid = "Patient"+ (patientsDatabase.getTotalPatient()+1);
        Patient p = new OfflinePatients(pid, patientName, patientIllness, patientAge, patientGender, 1);
        patientsDatabase.addPatient(p);
        Doctor d = doctorsDatabase.assignPatientToDoctor(p);
        System.out.println("Patient "+ p.getPatientName() + " got admitted into hospital with patient ID "+p.pId());
        System.out.println(p.getPatientName() + " got assign to doctor "+d.getDoctorName() + " whos doctor id is "+d.docId());
    }
    // 12
    // HSP13
    public void appointDoctor(String doctorName, String doctorDegree, int doctorAge, String doctorSpeciality){
        int totalDocs = doctorsDatabase.getTotalDocs();
        String docId = "HSP" + (totalDocs + 1);
        OfflineDoctors doc = new OfflineDoctors(docId, doctorName, doctorDegree, doctorSpeciality, doctorAge);
        doctorsDatabase.addDoctorToDB(doc);
    }
}
