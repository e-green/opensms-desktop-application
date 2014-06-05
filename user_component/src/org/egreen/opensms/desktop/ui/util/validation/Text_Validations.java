/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.egreen.opensms.desktop.ui.util.validation;

import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 *
 * @author ChanakaDe
 */
public class Text_Validations {

    /**
     * This validateTelephoneNo() method is used to check the telephone number
     * which is entered by the user. Only numbers are allowed in this text
     * field.
     */
    public static void validatePhoneNo(TextField textField) {
        int caretPosition = textField.getCaretPosition();
        if (!textField.getText().matches("^[0-9]{0,10}$")) {
            textField.setText(textField.getText().substring(0, caretPosition - 1) + textField.getText().substring(caretPosition));
            textField.positionCaret(caretPosition - 1);
        }
    }

    /**
     * This method is used for validate all the name fields. This method is
     * called in all the
     *
     * @FXML name validation methods.
     * @param textField
     */
    public static void validateAllNames(TextField textField) {
        String regx = "^[\\p{L} .'-]+$";
        String name = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!name.matches(regx)) {
            textField.setText(name.substring(0, caretPosition - 1) + name.substring(caretPosition));
            textField.positionCaret(caretPosition - 1);
        }
    }

    /**
     * This validateEmail() method is used to check whether the user input email
     * address is correct or incorrect
     */
    public static void validateEmailRemote(TextField textField) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = textField.getText();
        Boolean b = email1.matches(EMAIL_REGEX);
        String defaultStyle = textField.getStyle();
        if (b) {
            textField.setStyle("-fx-border-color:#EFEFEF");
        } else {
            Tooltip tooltip = new Tooltip("Enter  valid email");
            textField.setTooltip(tooltip);
            textField.setStyle("-fx-border-color:red");

        }
    }
}
