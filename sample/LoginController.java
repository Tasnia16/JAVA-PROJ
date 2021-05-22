package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPass;
    @FXML
    private Button btnGenerate;

    public void login(ActionEvent event) throws IOException {
        if(txtUserName.getText().equals("User") && txtPass.getText().equals("1234"))
        {
            lblStatus.setText("Login Successful!");
            Parent FrontPageController2 = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
            Scene FrontPageScene = new Scene(FrontPageController2);
            Stage FrontPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage.setTitle("Shop Management");
            FrontPageStage.setScene(FrontPageScene);
            FrontPageStage.show();
        }

        else lblStatus.setText("Login Failed!");

    }
}
