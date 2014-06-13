/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ChanakaDe
 */
public class Role {
    private int rollId;
    private String description;

    public Role() {
    }

    public Role(int rollId, String description) {
        this.rollId = rollId;
        this.description = description;
    }

    /**
     * @return the rollId
     */
    public int getRollId() {
        return rollId;
    }

    /**
     * @param rollId the rollId to set
     */
    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
