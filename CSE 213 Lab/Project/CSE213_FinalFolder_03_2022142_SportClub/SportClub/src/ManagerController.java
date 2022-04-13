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
public class ManagerController implements Initializable {

    @FXML
    private Button LogoutButton;
    @FXML
    private Button setPlayerInfobutton;
    @FXML
    private Button setPlaygroundTimebutton;
    @FXML
    private Button setGameTimebutton;

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
    private void setPlayerInfoclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage) setPlayerInfobutton.getScene().getWindow();
                stagem.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("setplayerinfo.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();    
    }

    @FXML
    private void setPlaygroundTimeclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage) setPlaygroundTimebutton.getScene().getWindow();
                stagem.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("setplaygroundtime.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
    }

    @FXML
    private void setGameTimeclick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("setGameTime.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) setPlayerInfobutton.getScene().getWindow();
                stagem.close();
    }
    
}
