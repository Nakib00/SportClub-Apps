/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class ShowplaygroundtimeController implements Initializable {

    @FXML
    private Button backbutton;
    @FXML
    private Button showbutton;
    @FXML
    private TextArea outputTextArea;

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
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("coach.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void showbuttonclick(ActionEvent event) throws FileNotFoundException {
        outputTextArea.clear();
        File f = null;
        Scanner sc; 
        String str; 
        String[] tokens;
        
        f = new File("playGroundTime.txt");
            sc = new Scanner(f);
            
            if(f.exists()){
                outputTextArea.appendText("Content of play Ground Time.txt:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputTextArea.appendText(
                            "Coach Id="+tokens[0]
                            +", Start Time="+tokens[1]
                            +", End Time="+tokens[2]
                            +", Ground Name="+tokens[3]+"\n"                    
                    );
                }
            }else{
                outputTextArea.setText("oops! play Ground Time.txt does not exist...");
            }
    }
    
}
