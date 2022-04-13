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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class SetdoctorapoinmentController implements Initializable {

    @FXML
    private Button backbutton;
    @FXML
    private Button uploadbutton;
    @FXML
    private TextField idtextfild;
    @FXML
    private TextField problemtextfild;
    @FXML
    private TextField timetextfild;
    @FXML
    private DatePicker date;

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
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("player.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void uploadonclick(ActionEvent event) throws IOException {
        LocalDate dateA =  date.getValue();
       String appointDate = dateA.toString();
       
        File f = null;
        FileWriter fw = null;

        f = new File("DoctorAppointment.txt"); 
        
        if(f.exists()){
                fw = new FileWriter(f,true);
            } 
            else{
                fw = new FileWriter(f);
            } 
        
        fw.write(
            	idtextfild.getText()+","	
                +problemtextfild.getText()+","	
                +timetextfild.getText()+","
                +appointDate+"\n"
            );
        
        if(fw != null){
            fw.close();
            
            //Alert using Information
           Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Dessemination of Notice...");
        a.setContentText("Appoinment will Submit");
        a.showAndWait();
        
        //Clear the text fild after click submit button
        idtextfild.clear();
        problemtextfild.clear();
        timetextfild.clear();
    }
    }
    
}
