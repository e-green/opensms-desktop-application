/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.egreen.opensms.desktop.ui.fxml;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ChanakaDe
 */
public class GrnOrderController implements Initializable {

//<editor-fold defaultstate="collapsed" desc="These are the components we used in the window">
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private AnchorPane selectVenderTab;
    @FXML
    private Button venderButton;
    @FXML
    private AnchorPane seletItemTab;
    @FXML
    private Button itemButton;
    @FXML
    private AnchorPane updateBatchTab;
    @FXML
    private TabPane tabbedPanefull;
    @FXML
    private TextField expDateText;
    @FXML
    private CheckBox expireDateCheckBox;
//</editor-fold>
    
    /**
     * This method is used to get the next tab after clicking the button
     */
    @FXML
    public void nextPane() {
        SingleSelectionModel<Tab> selectionModel = tabbedPanefull.getSelectionModel();
        selectionModel.selectNext();
    }
    
    /**
     * This method is used to get the previous tab after clicking the button
     */
    @FXML
    public void previousPane() {
        SingleSelectionModel<Tab> selectionModel = tabbedPanefull.getSelectionModel();
        selectionModel.selectPrevious();
    }
    
    /**
     * The focused text field is disabled, user can unlock the text field by using this method.
     */
    @FXML
    public void enableText(){
        if (expireDateCheckBox.isSelected()) {
            expDateText.setDisable(false);
        }else{
            expDateText.setDisable(true);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
