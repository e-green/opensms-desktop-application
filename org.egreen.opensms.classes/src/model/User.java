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
public class User {
    private int userId;
    private String userName;
    private String password;
    private Date createDate;
    private int accountStatus;

    public User() {
    }

    public User(int userId, String userName, String password, Date createDate, int accountStatus) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
        this.accountStatus = accountStatus;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the accountStatus
     */
    public int getAccountStatus() {
        return accountStatus;
    }

    /**
     * @param accountStatus the accountStatus to set
     */
    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
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
        final User other = (User) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.createDate, other.createDate)) {
            return false;
        }
        if (this.accountStatus != other.accountStatus) {
            return false;
        }
        return true;
    }
    
    
}
