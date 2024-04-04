package Model;

import Model.Interfaces.Patient;

public class OfflinePatients implements Patient {
    String pId;
    String patientName;
    String patientIllness;
    int patientAge;
    String patientGender;
    int bedNumber;

    public OfflinePatients(String pId, String patientName, String patientIllness, int patientAge, String patientGender, int bedNumber) {
        this.pId = pId;
        this.patientName = patientName;
        this.patientIllness = patientIllness;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.bedNumber = bedNumber;
    }

    public String getPatientName(){
        return patientName;
    }
    @Override
    public String pId() {
        return pId;
    }

    public void getMyDetails(){
        System.out.println("Hey I am patient "+patientName);
        System.out.println("My patientId is "+pId);
        System.out.println("My Illness is "+patientIllness);
        System.out.println("My bed Number "+bedNumber);
    }
    public void getMyBedNumber(){
        System.out.println(bedNumber);
    }
    public void assignMeDoctor(){

    }
}
