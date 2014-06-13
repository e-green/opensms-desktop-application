/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ChanakaDe
 */
public class User_role {
    private int role;
    private int user;
    private Date assignDate;
    private Date ressignDate;
    private int active;

    public User_role() {
    }

    public User_role(int role, int user, Date assignDate, Date ressignDate, int active) {
        this.role = role;
        this.user = user;
        this.assignDate = assignDate;
        this.ressignDate = ressignDate;
        this.active = active;
    }

    /**
     * @return the role
     */
    public int getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(int role) {
        this.role = role;
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
     * @return the ressignDate
     */
    public Date getRessignDate() {
        return ressignDate;
    }

    /**
     * @param ressignDate the ressignDate to set
     */
    public void setRessignDate(Date ressignDate) {
        this.ressignDate = ressignDate;
    }

    /**
     * @return the active
     */
    public int getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final User_role other = (User_role) obj;
        if (this.role != other.role) {
            return false;
        }
        if (this.user != other.user) {
            return false;
        }
        if (!Objects.equals(this.assignDate, other.assignDate)) {
            return false;
        }
        if (!Objects.equals(this.ressignDate, other.ressignDate)) {
            return false;
        }
        if (this.active != other.active) {
            return false;
        }
        return true;
    }
    
    
}
