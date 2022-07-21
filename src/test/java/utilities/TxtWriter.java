package utilities;
import pojos.Appointment_01;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TxtWriter {
    public static void saveUiPatientData(Appointment_01 appointment) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("applicant_data"), true);
            //  file location
            //  location + fileName + txt
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointment.toString() + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveAPIPatientData(Appointment_01[] appointments) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("applicants_api_data"), true);
            //  file location
            //  location + fileName + txt
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i< appointments.length;i++){
                bw.append(appointments[i].toString()+"\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TxtWriter commit try
}
