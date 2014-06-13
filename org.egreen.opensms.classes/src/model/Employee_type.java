/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author ChanakaDe
 */
public class Employee_type {
    private int user;
    private int type;
    private Date assignDate;
    private Date resignDate;

    public Employee_type() {
    }

    public Employee_type(int user, int type, Date assignDate, Date resignDate) {
        this.user = user;
        this.type = type;
        this.assignDate = assignDate;
        this.resignDate = resignDate;
    }

    /**
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the assignDate
     */
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * @param assignDate the assignDate to set
     */
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    /**
     * @return the resignDate
     */
    public Date getResignDate() {
        return resignDate;
    }

    /**
     * @param resignDate the resignDate to set
     */
    public void setResignDate(Date resignDate) {
        this.resignDate = resignDate;
    }
     
    
}
