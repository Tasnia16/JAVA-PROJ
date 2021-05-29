package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblStatus;


    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPass;

    public void login(ActionEvent event) throws IOException {
        if(txtUserName.getText().equals("User") && txtPass.getText().equals("1234"))
        {
            lblStatus.setText("Login Successful!");
            Parent FrontPageController = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
            Scene FrontPageScene = new Scene(FrontPageController);
            Stage FrontPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage.setTitle("Shop Management");
            FrontPageStage.setScene(FrontPageScene);
            FrontPageStage.show();
        }
        else lblStatus.setText("Login Failed!");
    }


}
