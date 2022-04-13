/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import user.student;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class FXMLDocumentController implements Initializable {

    @FXML private TextField IDTEXTFIND;
    @FXML private TextField NAMETEXTFILD;
    @FXML private TextField CGPATEXTFILD;
    @FXML private Label SHOWDATAFROMTEXTFILW;
    ArrayList<student> stuList = new ArrayList<student>(); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ADDTOSTUDENTLISTBUTTON(ActionEvent event) {
        stuList.add(
                new student(
                     Integer.parseInt(IDTEXTFIND.getText()),
                     NAMETEXTFILD.getText(),
                     Float.parseFloat(CGPATEXTFILD.getText())
                )
            );
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Congratulation New Student Added");
        a.showAndWait();
    }

    @FXML
    private void IDTEXTCLINE(MouseEvent event) {
        IDTEXTFIND.clear();
    }

    @FXML
    private void NAMETEXTCLINE(MouseEvent event) {
        NAMETEXTFILD.clear();
    }

    @FXML
    private void CGPATEXTCLINE(MouseEvent event) {
        CGPATEXTFILD.clear();
    }

    @FXML
    private void SAVESTUDENTLISTINTEXT(ActionEvent event) {
        try {
            FileWriter fw = new FileWriter("student.txt",true); //appand 
            for(student st:stuList) fw.write(st.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void LOADCONTANTINTHETEXTFILE(ActionEvent event) {
        
    }
    
}
