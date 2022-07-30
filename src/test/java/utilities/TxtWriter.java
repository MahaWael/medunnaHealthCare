package utilities;

import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class TxtWriter {

    public static void saveUiTestItemData(US17_TestItemsPojo testItemsPojo) {
        try {

            //file creation
            FileWriter fw = new FileWriter(ConfigReader.getProperty("testItem_UI_data"), true);
            //  file location
            //  location + fileName + txt

            //records creation
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(testItemsPojo.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAPITestItemData(US17_TestItemsPojo[] testItemsPojos) {
        try {

            //file creation
            FileWriter fw = new FileWriter(ConfigReader.getProperty("testItem_API_data"), true);
            //  file location
            //  location + fileName + txt

            //records creation
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < testItemsPojos.length; i++) {

                bw.append(testItemsPojos[i].toString() + "\n");

            }

            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            for (int i = 0; i < appointments.length; i++) {
                bw.append(appointments[i].toString() + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void savePatientApiData(US09_PatientPojo[] us09patient) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("patients09_api_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < us09patient.length; i++) {
                bw.append(us09patient[i].toString() + "\n");
            }

            bw.append(us09patient.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        //TxtWriter commit try
        public static void saveAPIPatientData(Appointment[] appointments) {
            try {
                FileWriter fw = new FileWriter(ConfigReader.getProperty("applicants_api_data"), true);
                //  file location
                //  location + fileName + txt
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < appointments.length; i++) {
                    bw.append(appointments[i].toString() + "\n");
                }
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void savePatientApiData(Patient_02[] patient02) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("patients09_api_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < patient02.length; i++) {
                bw.append(patient02[i].toString() + "\n");
            }

            bw.append(patient02.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveUIRegistrantData(Registrant registrant) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("applicant_data"), true);
            //  file location
            //  location + fileName + txt
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(registrant.toString() + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveUIRegistrantData(Registrant[] registrant) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("patients09_api_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < registrant.length; i++) {
                bw.append(registrant[i].toString() + "\n");
            }

            bw.append(registrant.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveUiAppointmentData(Appointment appointment) {
        try {

            //file creation
            FileWriter fw = new FileWriter(ConfigReader.getProperty("testItem_UI_data"), true);
            //  file location
            //  location + fileName + txt

            //records creation
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointment.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveAppointmentApiData(Appointment[] appointment
    ) {
        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("patients09_api_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < appointment.length; i++) {
                bw.append(appointment[i].toString() + "\n");
            }

            bw.append(appointment.toString() + "\n");
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

