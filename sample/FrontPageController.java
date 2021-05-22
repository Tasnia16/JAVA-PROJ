package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;


public class FrontPageController {
    @FXML
    private Button btnGenerate;
    @FXML
    private Button btnGenerate1;
    @FXML
    private Button btnGenerate2;



    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==btnGenerate){
            Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/Controller2.fxml"));
            Scene FrontPageScene3 = new Scene(FrontPageController3);
            Stage FrontPageStage3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage3.setTitle("Shop Management");
            FrontPageStage3.setScene(FrontPageScene3);
            FrontPageStage3.show();
        }
        else if(event.getSource()==btnGenerate1){
            Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/Food.fxml"));
            Scene FrontPageScene3 = new Scene(FrontPageController3);
            Stage FrontPageStage3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage3.setTitle("Shop Management");
            FrontPageStage3.setScene(FrontPageScene3);
            FrontPageStage3.show();
        }
        else if(event.getSource()==btnGenerate2){
            Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/Clean.fxml"));
            Scene FrontPageScene3 = new Scene(FrontPageController3);
            Stage FrontPageStage3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
            FrontPageStage3.setTitle("Shop Management");
            FrontPageStage3.setScene(FrontPageScene3);
            FrontPageStage3.show();
        }
    }
}


