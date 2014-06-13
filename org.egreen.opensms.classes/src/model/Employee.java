/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Objects;

/**
 *
 * @author ChanakaDe
 */
public class Employee {
    private int userId;
    private String surName;
    private String initials;
    private String nameRefferedByInitial;

    public Employee() {
    }

    public Employee(int userId, String surName, String initials, String nameRefferedByInitial) {
        this.userId = userId;
        this.surName = surName;
        this.initials = initials;
        this.nameRefferedByInitial = nameRefferedByInitial;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the initials
     */
    public String getInitials() {
        return initials;
    }

    /**
     * @param initials the initials to set
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the nameRefferedByInitial
     */
    public String getNameRefferedByInitial() {
        return nameRefferedByInitial;
    }

    /**
     * @param nameRefferedByInitial the nameRefferedByInitial to set
     */
    public void setNameRefferedByInitial(String nameRefferedByInitial) {
        this.nameRefferedByInitial = nameRefferedByInitial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.surName, other.surName)) {
            return false;
        }
        if (!Objects.equals(this.initials, other.initials)) {
            return false;
        }
        if (!Objects.equals(this.nameRefferedByInitial, other.nameRefferedByInitial)) {
            return false;
        }
        return true;
    }
    
    
}
