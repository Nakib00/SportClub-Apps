/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dockyard.management;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author bapti
 */
public class ShipSecurerHScreenController implements Initializable {

    @FXML
    private Button LogoutButton;
    @FXML
    private Label SsIDLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
   public void IdShipSecurerHScreenController(String ID){
        SsIDLabel.setText(ID);
    }     

    @FXML
    private void LogoutButtonClicked(ActionEvent event) throws IOException {
         Stage stagem = (Stage)LogoutButton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }
    
}
