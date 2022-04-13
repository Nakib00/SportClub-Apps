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
public class ShowGameTimeForPlayerController implements Initializable {

    @FXML
    private Button backbutton;
    @FXML
    private TextArea outputTextArea;
    @FXML
    private Button showbutton;

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
    private void readTextFileButtonOnClick(ActionEvent event) throws FileNotFoundException {
        outputTextArea.clear();
        File f = null;
        Scanner sc; 
        String str; 
        String[] tokens;
        
        f = new File("GameTime.txt");
            sc = new Scanner(f);
            
            if(f.exists()){
                outputTextArea.appendText("Content of GameTime.txt:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    outputTextArea.appendText(
                            "Game Name="+tokens[0]
                            +", Date="+tokens[1]
                            +", Time="+tokens[2]
                            +", Ground="+tokens[3]+"\n"                    
                    );
                }
            }else{
                outputTextArea.setText("oops! GameTime.txt does not exist...");
            }
    }
    
}
