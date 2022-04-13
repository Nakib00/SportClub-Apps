/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dockyard.management;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author bapti
 */
public class RegistrationScreenController implements Initializable {

    @FXML
    private TextField userIDTextfield;
    @FXML
    private TextField passwordTextfild;
    @FXML
    private TextField emailIDTextfield;
    @FXML
    private TextField phoneTextfield;
    @FXML
    private ComboBox userTypeBar;
    @FXML
    private TextArea addressTextfield;
    @FXML
    private Button registerButton;
    @FXML
    private TextField userNameTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeBar.getItems().addAll("Dockyard Director", "Ship Securer", "Cargo Inspection", "Dock Maintenance", "Safety Monitoring");
    }

    @FXML
    private void registerButtonClicked(ActionEvent event) {
        String userID = userIDTextfield.getText();

        String password = passwordTextfild.getText();

        String emailID = emailIDTextfield.getText();

        String phone = phoneTextfield.getText();

        String choice = userTypeBar.getValue().toString();

        String address = addressTextfield.getText();

        String userName = userNameTextfield.getText();
        
        
        
          if (!name_check(userName)) {
            JOptionPane.showMessageDialog(null, "Name cannot be blank or uncorrect");
        } else if (!id_check(userID)) {
            JOptionPane.showMessageDialog(null, "ID cannot be blank or incorrect ");
        } else if (!password_check(password)) {
            JOptionPane.showMessageDialog(null, " password cannot be blank or incorrect");
        } else if (!email_check(emailID)) {
            JOptionPane.showMessageDialog(null, "Email cannot be blank or incorrect");
        } else if (!phone_check(phone)) {
            JOptionPane.showMessageDialog(null, "Phone cannot be blank or incorrect");
        } else if (!address_check(address)) {
            JOptionPane.showMessageDialog(null, "Address cannot be blank or incorrect");
        }
        else{
        id_password_position( userID,  password, emailID,  phone, choice, address,userName);
        userIDTextfield.setText("");

        passwordTextfild.setText("");

        emailIDTextfield.setText("");

        phoneTextfield.setText("");

        addressTextfield.setText("");

        userNameTextfield.setText("");
        }

    }

    private void id_password_position(String userID, String password, String emailID, String phone, String choice, String address, String userName) {
        DataOutputStream out = null;

        FileWriter fw_admin = null;
        BufferedWriter bw_admin = null;

        try {
            fw_admin = new FileWriter("Data.txt", true);

        } catch (Exception ex) {
        }

        bw_admin = new BufferedWriter(fw_admin);
//-----------        
        String l = userName+"-" + userID+"-" + password+"-" + emailID+"-" + phone+"-" + choice+"-" + address;

        try {
            bw_admin.write(l);
            bw_admin.write("\n");
        } catch (IOException ex) {
            // Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw_admin.close();
                //out.close();

            } catch (Exception ex) {
                //Logger.getLogger(AddEmlpoyeeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
        private boolean name_check(String name) {
        if (name.equals("") || name.contains(",") || name.contains("-")) {
            return false;
        }
        return true;

    }

    
     private boolean id_check(String id){
        if(id.equals("") || id.contains(",") || id.contains("-")){
        return false;
        }
       return true;
   
   }
     private boolean password_check(String password) {
        if (password.equals("") || password.contains(",") || password.contains("-")) {
            return false;
        }
        return true;

    }

    private boolean email_check(String email) {
        if (email.equals("") || email.contains(",") || email.contains("-")) {
            return false;
        }
        return true;

    }

    private boolean phone_check(String phone) {
        if (phone.equals("") || phone.contains(",") || phone.contains(":")) {
            return false;
        }
        return true;

    }

    private boolean address_check(String address) {
        if (address.equals("") || address.contains("-")) {
            return false;
        }
        return true;

    }

}

