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
public class DoctorController implements Initializable {

    @FXML
    private Button LogoutButton;
    @FXML
    private Button uploadPlayerHealthInfobutton;
    @FXML
    private Button showAppointmentTimebutton;
    @FXML
    private Button updatePlayerHealthInfobutton;

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
    private void uploadPlayerHealthInfoclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage)uploadPlayerHealthInfobutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("uploadplayerhealthinfo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void showAppointmentTimeclick(ActionEvent event) throws IOException {
         Stage stagem = (Stage)showAppointmentTimebutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showAppoinmentTime.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void updatePlayerHealthInfoclick(ActionEvent event) {
        
    }
    
}
