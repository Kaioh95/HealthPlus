package Cashier;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.ImageView;
/**
 *
 * @author heshan
 */
public class Refund {
    /*@ nullable spec_public @*/ private final SimpleStringProperty patientID = new SimpleStringProperty("");
    /*@ nullable spec_public @*/ private final SimpleStringProperty date = new SimpleStringProperty("");
    /*@ nullable spec_public @*/ private final SimpleStringProperty billID = new SimpleStringProperty("");
    /*@ nullable spec_public @*/ private final SimpleStringProperty service = new SimpleStringProperty("");
    /*@ nullable spec_public@*/ private final SimpleStringProperty bill = new SimpleStringProperty("");
    /*@ nullable spec_public @*/ private ImageView refund;

    //@ invariant patientID != null && date != null && billID != null && service != null && bill != null;

    /*
    public Refund() {
        this("", "","","","","");
    }
    */

    //@ requires patientID != null && date != null && billID != null && service != null && bill != null && refund != null;
    //@ ensures getPatientID().equals(patientID);
    //@ ensures getDate().equals(date);
    //@ ensures getBillID().equals(billID);
    //@ ensures getService().equals(service);
    //@ ensures getBill().equals(bill);
    //@ ensures getRefund().equals(refund);
    public Refund(String patientID,String date, String billID, String service, String bill,  ImageView refund) {
        setPatientID(patientID);
        setDate(date);
        setBillID(billID);
        setService(service);
        setBill(bill);
        setRefund(refund);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getPatientID() {
        return patientID.get();
    }

    //@ requires value != null;
    //@ ensures getPatientID().equals(value);
    public void setPatientID(String value) {
        patientID.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getDate() {
        return date.get();
    }

    //@ requires value != null;
    //@ ensures getDate().equals(value);
    public void setDate(String value) {
        date.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getBillID() {
        return billID.get();
    }

    //@ requires value != null;
    //@ ensures getBillID().equals(value);
    public void setBillID(String value) {
        billID.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getService() {
        return service.get();
    }

    //@ requires value != null;
    //@ ensures getService().equals(value);
    public void setService(String value) {
        service.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ String getBill() {
        return bill.get();
    }

    //@ requires value != null;
    //@ ensures getBill().equals(value);
    public void setBill(String value) {
        bill.set(value);
    }

    //@ ensures \result != null;
    public /*@ pure @*/ ImageView getRefund() {
        return this.refund;
    }

    //@ requires value != null;
    //@ ensures getRefund().equals(value);
    public void setRefund(ImageView value) {
        refund = value;
    }
    
}







