import Model.Hospital;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hospital aiims = new Hospital("Aiims New Delhi", 1000, "New Delhi", 123456);
        aiims.appointDoctor("SOM", "MBBS", 21, "Heart");
        aiims.appointDoctor("TIW", "MBBS", 40, "Brain");
        aiims.appointDoctor("RAJ", "MBBS", 27, "stomach");

        aiims.getHospitalName();
        aiims.getTotalBeds();
        aiims.getDoctorDetails("HSP3");
        aiims.getTotalPatientAvailable();

        aiims.admitPatient("ABC", "Fever", 30, "Male");
        aiims.admitPatient("EFG","Cardiac", 20, "Male");
        aiims.admitPatient("WSG", "Fever", 35, "Male");
        aiims.getPatientDetails("Patient1");
        aiims.getPatientDetails("Patient3");
        aiims.getTotalPatientAvailable();
    }
}