package Cashier;

import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author heshan
 */
public class Bill {
    //@ spec_public
    private final SimpleStringProperty patientID = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty date = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty doctor = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty hospital = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty pharmacy = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty laboratory = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty appointment = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty bill = new SimpleStringProperty("");

    //@ spec_public
    private final SimpleStringProperty billID = new SimpleStringProperty("");

    //@ public invariant patientID != null;
    //@ public invariant date != null;
    //@ public invariant doctor != null;
    //@ public invariant hospital != null;
    //@ public invariant pharmacy != null;
    //@ public invariant laboratory != null;
    //@ public invariant appointment != null;
    //@ public invariant bill != null;
    //@ public invariant billID != null;

    //@ ensures getPatientID() != null && getDate() != null && getDoctor() != null && getHospital() != null && getPharmacy() != null && getLaboratory() != null && getAppointment() != null && getBill() != null && getBillID() != null;
    public Bill() {
        this("", "", "", "", "", "", "", "", "");
    }

    //@ requires patientID != null && date != null && doctor != null && hospital != null && pharmacy != null && laboratory != null && appointment != null && bill != null && billID != null;
    //@ ensures getPatientID().equals(patientID) && getDate().equals(date) && getDoctor().equals(doctor) && getHospital().equals(hospital) && getPharmacy().equals(pharmacy) && getLaboratory().equals(laboratory) && getAppointment().equals(appointment) && getBill().equals(bill) && getBillID().equals(billID);
    public Bill(String patientID, String date, String doctor, String hospital, String pharmacy, String laboratory, String appointment, String bill, String billID) {
        setPatientID(patientID);
        setDate(date);
        setDoctor(doctor);
        setHospital(hospital);
        setPharmacy(pharmacy);
        setLaboratory(laboratory);
        setAppointment(appointment);
        setBill(bill);
        setBillID(billID);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getPatientID() {
        return patientID.get();
    }

    //@ requires value != null;
    //@ ensures getPatientID().equals(value);
    public void setPatientID(/*@ non_null @*/ String value) {
        patientID.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getDate() {
        return date.get();
    }

    //@ requires value != null;
    //@ ensures getDate().equals(value);
    public void setDate(/*@ non_null @*/ String value) {
        date.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getDoctor() {
        return doctor.get();
    }

    //@ requires value != null;
    //@ ensures getDoctor().equals(value);
    public void setDoctor(/*@ non_null @*/ String value) {
        doctor.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getHospital() {
        return hospital.get();
    }

    //@ requires value != null;
    //@ ensures getHospital().equals(value);
    public void setHospital(/*@ non_null @*/ String value) {
        hospital.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getPharmacy() {
        return pharmacy.get();
    }

    //@ requires value != null;
    //@ ensures getPharmacy().equals(value);
    public void setPharmacy(/*@ non_null @*/ String value) {
        pharmacy.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getLaboratory() {
        return laboratory.get();
    }

    //@ requires value != null;
    //@ ensures getLaboratory().equals(value);
    public void setLaboratory(/*@ non_null @*/ String value) {
        laboratory.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getAppointment() {
        return appointment.get();
    }

    //@ requires value != null;
    //@ ensures getAppointment().equals(value);
    public void setAppointment(/*@ non_null @*/ String value) {
        appointment.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getBill() {
        return bill.get();
    }

    //@ requires value != null;
    //@ ensures getBill().equals(value);
    public void setBill(/*@ non_null @*/ String value) {
        bill.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getBillID() {
        return billID.get();
    }

    //@ requires value != null;
    //@ ensures getBillID().equals(value);
    public void setBillID(/*@ non_null @*/ String value) {
        billID.set(value);
    }
}






