/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author nakib
 */
public class LoginController implements Initializable {

    @FXML
    private TextField useridforlogin;
    @FXML
    private PasswordField passwordforlogin;
    @FXML
    private Button loginbutton;
    @FXML
    private ComboBox combobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combobox.getItems().addAll("Manager", "Player", "Coach", "Doctor", "Marchandise officer");
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        String userIDText = useridforlogin.getText();
        String passwordText = passwordforlogin.getText();
        String choice = combobox.getValue().toString();
        
        if ("Manager".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("manager.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginbutton.getScene().getWindow();
                stagem.close();
            }else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
        
        if ("Player".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("player.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginbutton.getScene().getWindow();
                stagem.close();
            }else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
        
        if ("Coach".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("coach.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginbutton.getScene().getWindow();
                stagem.close();
            }else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
        
        if ("Doctor".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("doctor.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginbutton.getScene().getWindow();
                stagem.close();
            }else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
        
        if ("Marchandise officer".equals(choice)) {
            if (askAndCheckUsernameAndPassword(userIDText, passwordText, choice)) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("marchandiseofficer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                Stage stagem = (Stage) loginbutton.getScene().getWindow();
                stagem.close();
            }else {
                JOptionPane.showMessageDialog(null, "Not valid");
            }
        };
    }

    @FXML
    private void select(ActionEvent event) {
    }
    
    
    
    public boolean askAndCheckUsernameAndPassword(String id, String password, String position){
        String ido = null;
        String pass = null;
        String posit = null;
        File f = new File("login.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(LoginHScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        String s = null;

        if (f.exists()) {

            try {
                while ((s = br.readLine()) != null) {
                    if (s.contains(position)) {
                        String n = s;
                        String words[] = n.split("-");
                        ido = words[1];
                        pass = words[2];
                        posit = words[3];

                    }
                     
                }
            } catch (Exception ex) {

            }

            if (ido.equals(id) && pass.equals(password) && posit.equals(position)) {
                return true;
            } else {
                return false;

            }

        } else {
            return false;

        }
    }
    
}
