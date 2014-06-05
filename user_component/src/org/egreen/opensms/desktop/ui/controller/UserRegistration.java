/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.egreen.opensms.desktop.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 *
 * @author ChanakaDe
 */
public class UserRegistration implements Initializable {

    //<editor-fold defaultstate="collapsed" desc="Initializing Components">
    @FXML
    private TextField userRegistration_tfEmail;

    @FXML
    private TextField userRegistration_tfTelephone;

    @FXML
    private TextField userRegistration_tfName;

    @FXML
    private TextField userRegistration_tfSurName;

    @FXML
    private TextField userRegistration_tfNameRefferred;

    @FXML
    private TextField userRegistration_tfInitials;
//</editor-fold>

    /**
     * This validateEmail() method is used to check whether the user input email
     * address is correct or incorrect
     */
    @FXML
    public void validateEmail() {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = userRegistration_tfEmail.getText();
        Boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email1 + " :Valid = " + b);

        String defaultStyle = userRegistration_tfEmail.getStyle();
        System.out.println(defaultStyle);
        if (b) {
            userRegistration_tfEmail.setStyle("-fx-border-color:#EFEFEF");
        } else {
            Tooltip tooltip = new Tooltip("Enter  valid email");
            userRegistration_tfEmail.setTooltip(tooltip);
            userRegistration_tfEmail.setStyle("-fx-border-color:red");

        }
    }

    /**
     * This validateTelephoneNo() method is used to check the telephone number
     * which is entered by the user. Only numbers are allowed in this text
     * field.
     */
    @FXML
    public void validateTelephoneNo() {
        String telNo = userRegistration_tfTelephone.getText();
        int caretPosition = userRegistration_tfTelephone.getCaretPosition();
        if (!telNo.matches("^[0-9]{0,10}$")) {
            userRegistration_tfTelephone.setText(telNo.substring(0, caretPosition - 1) + telNo.substring(caretPosition));
            userRegistration_tfTelephone.positionCaret(caretPosition - 1);
        }
    }

//<editor-fold defaultstate="collapsed" desc="Validation Text Fileds for user inputs">
    @FXML
    public void validateName() {
        validateAllNames(userRegistration_tfName);
    }
    
    @FXML
    public void validateSurName() {
        validateAllNames(userRegistration_tfSurName);
    }
    
    @FXML
    public void validateNameReferred() {
        validateAllNames(userRegistration_tfNameRefferred);
    }
    
    @FXML
    public void validateInitials() {
        validateAllNames(userRegistration_tfInitials);
    }
//</editor-fold>

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    /**
     * This method is used for validate all the name fields. This method is called in all the 
     * @FXML name validation methods.
     * @param textField
     */
    public void validateAllNames(TextField textField) {
        String regx = "^[\\p{L} .'-]+$";
        String name = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!name.matches(regx)) {
            textField.setText(name.substring(0, caretPosition - 1) + name.substring(caretPosition));
            textField.positionCaret(caretPosition - 1);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
