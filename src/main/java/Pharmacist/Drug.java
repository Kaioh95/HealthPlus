package Pharmacist;

import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author heshan
 */
public class Drug{
    //@ invariant name != null && type != null && unit != null && price != null && amount != null && suppliers != null;

    //@ spec_public
    final //@ non_null
            SimpleStringProperty name = new SimpleStringProperty("");
    final //@ non_null
    SimpleStringProperty type = new SimpleStringProperty("");
    final //@ non_null
    SimpleStringProperty unit = new SimpleStringProperty("");
    final //@ non_null
    SimpleStringProperty price = new SimpleStringProperty("");
    final //@ non_null
    SimpleStringProperty amount = new SimpleStringProperty("");
    final //@ non_null
    SimpleStringProperty suppliers = new SimpleStringProperty("");

    //@ ensures getName() != null && getType() != null && getUnit() != null && getPrice() != null && getAmount() >= 0 && getSuppliers() != null;
    public Drug() {
        this("", "", "","","","");
    }

    //@ ensures getName().equals(drugName) && getType().equals(drugType) && getUnit().equals(drugUnit) && getPrice().equals(unitPrice) && getAmount() == Integer.parseInt(amount) && getSuppliers().equals(suppliers);
    public Drug(String drugName, String drugType, String drugUnit, String unitPrice, String amount, String suppliers) {
        setName(drugName);
        setType(drugType);
        setUnit(drugUnit);
        setPrice(unitPrice);
        setAmount(amount);
        setSuppliers(suppliers);
    }

    //@ ensures \result != null;
    public /*@ non_null @*/ String getName() {
        return name.get();
    }

    /*@ requires value != null;
      @ ensures getName().equals(value);
      @ assignable name;
      @*/
    public void setName(/*@ non_null @*/ String value) {
        name.set(value);
    }

    //@ ensures \result != null;
    public /*@ non_null @*/ String getType() {
        return type.get();
    }

    //@ requires value != null;
    //@ ensures getType().equals(value);
    public void setType(/*@ non_null @*/ String value) {
        type.set(value);
    }

    //@ ensures \result != null;
    public /*@ non_null @*/ String getUnit() {
        return unit.get();
    }

    //@ requires value != null;
    //@ ensures getUnit().equals(value);
    public void setUnit(/*@ non_null @*/ String value) {
        unit.set(value);
    }

    //@ ensures \result != null;
    public /*@ non_null @*/ String getPrice() {
        return price.get();
    }

    //@ requires value != null;
    //@ ensures getPrice().equals(value);
    public void setPrice(/*@ non_null @*/ String value) {
        price.set(value);
    }

    //@ ensures \result >= 0;
    public int getAmount() {
        return Integer.parseInt(amount.get());
    }

    //@ requires value != null;
    //@ ensures getAmount() == Integer.parseInt(value);
    public void setAmount(/*@ non_null @*/ String value) {
        amount.set(value);
    }

    //@ ensures \result != null;
    public /*@ non_null @*/ String getSuppliers() {
        return suppliers.get();
    }

    //@ requires value != null;
    //@ ensures getSuppliers().equals(value);
    public void setSuppliers(/*@ non_null @*/ String value) {
        suppliers.set(value);
    }
    
}





