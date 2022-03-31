/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobilfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Kyo
 */
public class FXMLDocumentController {
    private Label label;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    void SwitchToAddMobil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/addMobil.fxml"));        
            Scene scene = new Scene(root);        
            stage.setScene(scene);
            stage.show();
    }

    
//    private void swtichToAddMobil(ActionEvent event) throws IOException{
//        Parent root = FXMLLoader.load(getClass().getResource("/View/addMobil.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);        
//        stage.setScene(scene);
//        stage.show();
//    }
    
    private void swtichToMainMenu(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/View/mainMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.show();
    }
    
}
