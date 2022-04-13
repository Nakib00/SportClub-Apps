/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dockyard.management;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author bapti
 */
public class LoginHScreenController implements Initializable {

    @FXML
    private ImageView Logo;
    @FXML
    private TextField userIDTextfield;
    @FXML
    private TextField passwordTextfield;
    @FXML
    private ComboBox userTypeBar;
    @FXML
    private Button loginButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userTypeBar.getItems().addAll("Manager club", "Ship Securer", "Cargo Inspection", "Dock Maintenance", "Safety Monitoring");
    }

    @FXML
    private void logininButtonClicked(ActionEvent event) throws IOException {
        String userIDText = userIDTextfield.getText();
        String passwordText = passwordTextfield.getText();
        String choice = userTypeBar.getValue().toString();

        if ("Manager club".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DockyardDirectorHScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                DockyardDirectorHScreenController h = fxmlLoader.getController();
                h.IdDockyardDirectorHScreenController(userIDText);
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginButton.getScene().getWindow();
                stagem.close();
            } else {
                JOptionPane.showMessageDialog(null, "Not valid");

            }
        };
        if ("Ship Securer".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ShipSecurerHScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                ShipSecurerHScreenController h = fxmlLoader.getController();
                h.IdShipSecurerHScreenController(userIDText);
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginButton.getScene().getWindow();
                stagem.close();
            } else {
                JOptionPane.showMessageDialog(null, "Not valid");

            }

        };
        if ("Cargo Inspection".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CargoInspectiorHScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                CargoInspectiorHScreenController h = fxmlLoader.getController();
                h.IdCargoInspectiorHScreenController(userIDText);
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginButton.getScene().getWindow();
                stagem.close();
            } else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
        if ("Dock Maintenance".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DockMaintenanceHScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                DockMaintenanceHScreenController h = fxmlLoader.getController();
                h.IdDockMaintenanceHScreenController(userIDText);
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginButton.getScene().getWindow();
                stagem.close();
            } else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }

        };
        if ("Safety Monitoring".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafetyMonitoringHScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                SafetyMonitoringHScreenController h = fxmlLoader.getController();
                h.IdSafetyMonitoringHScreenController(userIDText);
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginButton.getScene().getWindow();
                stagem.close();

           
              } else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }

        }
    }

    

    

    public boolean askAndCheckUsernameAndPassword(String id, String password, String position){
        String ido = null;
        String pass = null;
        String posit = null;
        File f = new File("Data.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(LoginHScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        String s = null;

        if (f.exists()) {

            try {
                while ((s = br.readLine()) != null) {
                    if (s.contains(position)) {
                        String n = s;
                        String words[] = n.split("-");
                        ido = words[1];
                        pass = words[2];
                        posit = words[5];

                    }
                     
                }
            } catch (Exception ex) {

            }

            if (ido.equals(id) && pass.equals(password) && posit.equals(position)) {
                return true;
            } else {
                return false;

            }

        } else {
            return false;

        }
    }

}
