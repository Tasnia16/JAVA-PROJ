package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 extends FrontPageController {
    @FXML
    private Button home;

    public void initialize(ActionEvent event) {
        try {
            if (event.getSource() == home) {
                Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
                Scene FrontPageScene3 = new Scene(FrontPageController3);
                Stage FrontPageStage3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FrontPageStage3.setTitle("Shop Management");
                FrontPageStage3.setScene(FrontPageScene3);
                FrontPageStage3.show();
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void btnACtion(ActionEvent e) {
        super.btnACtion(e);
    }
}
