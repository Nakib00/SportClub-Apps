/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class SetGameTimeController implements Initializable {

    @FXML
    private Button backbutton;
    @FXML
    private Button Submitbutton;
    @FXML
    private TextField gamenametextfild;
    @FXML
    private TextField timeofgaetextfild;
    @FXML
    private TextField groundtextfild;
    @FXML
    private DatePicker dateofgamepiker;

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
    private void submitonclick(ActionEvent event) throws IOException {
        LocalDate gamedate =  dateofgamepiker.getValue();
       String gamedatestring = gamedate.toString();
       
        File f = null;
        FileWriter fw = null;

        f = new File("GameTime.txt"); 
        
        if(f.exists()){
                fw = new FileWriter(f,true);
            } 
            else{
                fw = new FileWriter(f);
            } 
        
        fw.write(
            	gamenametextfild.getText()+","
                +gamedatestring+","	
                +timeofgaetextfild.getText()+","	
                +groundtextfild.getText()+"\n"
            );
        
        if(fw != null){
            fw.close();
            
            //Alert using Information
           Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Dessemination of Notice...");
        a.setContentText("Game Time will Submit");
        a.showAndWait();
        
        //Clear the text fild after click submit button
        gamenametextfild.clear();
        timeofgaetextfild.clear();
         groundtextfild.clear();
        
        } 
    }

    @FXML
    private void clinegamenametextfild(MouseEvent event) {
    }

    @FXML
    private void clinetimetextfild(MouseEvent event) {
    }

    @FXML
    private void clinegroundtextfild(MouseEvent event) {
    }

    @FXML
    private void clinedateciker(MouseEvent event) {
    }
    
}
