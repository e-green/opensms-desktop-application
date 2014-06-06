/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.egreen.opensms.desktop.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import org.egreen.opensms.desktop.ui.util.validation.Text_Validations;

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
    @FXML
    private TextField userRegistration_tfAddress2;
    @FXML
    private TextField userRegistration_tfAddress1;
    @FXML
    private Label label;
    @FXML
    private ComboBox<?> userRegistration_cbUserType;
    @FXML
    private PasswordField userRegistration_tfPassword;
    @FXML
    private CheckBox userRegistration_tf;
    @FXML
    private TextField userRegistration_tfUserName;
    @FXML
    private TextField userRegistration_tfPostalCode;
    @FXML
    private TextField userRegistration_tfCountry;
    @FXML
    private TextField userRegistration_tfCity;
    @FXML
    private TextField userRegistration_tfProvince;


    @FXML
    public void validateEmail() {
        Text_Validations.validateEmailRemote(userRegistration_tfEmail);
    }

    @FXML
    public void validateTelephoneNo() {
        Text_Validations.validatePhoneNo(userRegistration_tfTelephone);
    }

//<editor-fold defaultstate="collapsed" desc="Validation Text Fileds for user inputs">
    @FXML
    public void validateName() {
        Text_Validations.validateAllNames(userRegistration_tfName);
    }
    
    @FXML
    public void validateSurName() {
        Text_Validations.validateAllNames(userRegistration_tfSurName);
    }
    
    @FXML
    public void validateNameReferred() {
        Text_Validations.validateAllNames(userRegistration_tfNameRefferred);
    }
    
    @FXML
    public void validateInitials() {
        Text_Validations.validateAllNames(userRegistration_tfInitials);
    }
//</editor-fold>


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Platform.isSupported(ConditionalFeature.INPUT_METHOD);
    }

}
