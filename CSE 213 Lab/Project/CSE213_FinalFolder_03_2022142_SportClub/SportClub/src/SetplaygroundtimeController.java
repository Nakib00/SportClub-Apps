/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class SetplaygroundtimeController implements Initializable {

    @FXML
    private Button backbutton;
    @FXML
    private Button uploadbutton;
    @FXML
    private TextField coachidtextfild;
    @FXML
    private TextField starttietextfild;
    @FXML
    private TextField endtiemtextfild;
    @FXML
    private TextField groundtextfild;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backonclick(ActionEvent event) throws IOException {
        Stage stagem = (Stage)backbutton.getScene().getWindow();
            stagem.close();
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("manager.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void uploadbuttonclick(ActionEvent event) throws IOException {
        File f = null;
        FileWriter fw = null;

        f = new File("playGroundTime.txt"); 
        
        if(f.exists()){
                fw = new FileWriter(f,true);
            } 
            else{
                fw = new FileWriter(f);
            } 
        
        fw.write(
            	coachidtextfild.getText()+","
                +starttietextfild.getText()+","	
                +endtiemtextfild.getText()+","	
                +groundtextfild.getText()+"\n"
            );
        
        if(fw != null){
            fw.close();
        } 
        
        //Alert using Information
           Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Dessemination of Notice...");
        a.setContentText("Set playGround Time will Submit");
        a.showAndWait();
        
        //Clear the text fild after click submit button
        coachidtextfild.clear();
        starttietextfild.clear();
        endtiemtextfild.clear();
        groundtextfild.clear();
    }
    
}
