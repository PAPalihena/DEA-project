/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventSystem;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author HP
 */
public class EventBean implements Serializable{

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public EventBean(){
        
    }
    private String type;
    private String budget;
    private String contact;
    private String address;
    private Date dueDate;
    
}
