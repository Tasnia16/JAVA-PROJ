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


public class Clean {
    @FXML
    private Button btn1;

    public void NewAction(ActionEvent event) throws IOException {
        if(event.getSource()==btn1){
            Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
            Scene FrontPageScene3 = new Scene(FrontPageController3);
            Stage FrontPageStage3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage3.setTitle("Shop Management");
            FrontPageStage3.setScene(FrontPageScene3);
            FrontPageStage3.show();
        }
    }
}
