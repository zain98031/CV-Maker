/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_login_cvmaker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author zain9
 */
public class loginController implements Initializable {
    
   
    @FXML
    private AnchorPane signin;
    @FXML
    private AnchorPane signup;
    @FXML
    private AnchorPane rootan;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void opensigin(ActionEvent event) {
        signin.toFront();
    }

    @FXML
    private void opensignup(ActionEvent event) {
        signup.toFront();
    }

    @FXML
    private void close(ActionEvent event) {
        Stage s=(Stage)rootan.getScene().getWindow();
   s.close();
    }
    
}
