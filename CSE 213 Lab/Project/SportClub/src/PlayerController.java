/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class PlayerController implements Initializable {

    @FXML
    private Button LogoutButton;
    @FXML
    private Button showGameTimebutton;
    @FXML
    private Button seeHealthInfobutton;
    @FXML
    private Button setDoctorAppointmentbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LogoutButtonClicked(ActionEvent event) throws IOException {
        Stage stagem = (Stage)LogoutButton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void showGameTimeclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage)showGameTimebutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ShowGameTimeForPlayer.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void seeHealthInfoclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage)seeHealthInfobutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showplayerhealthinfo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void setDoctorAppointmentclick(ActionEvent event) throws IOException {
            Stage stagem = (Stage)setDoctorAppointmentbutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("setdoctorapoinment.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }
    
}
