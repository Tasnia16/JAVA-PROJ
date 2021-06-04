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

public class GroceryController extends FrontPageController {
    @FXML
    private Button home;
    @FXML
    private Button finish;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void initialize(ActionEvent event) {
        try {
            if (event.getSource() == home) {
                root = FXMLLoader.load(getClass().getResource("/sample/FrontPage.fxml"));
                scene = new Scene(root);
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("Shop Management");
                stage.setScene(scene);
                stage.show();
            }
	    else if (event.getSource() == finish) {
                root = FXMLLoader.load(getClass().getResource("/sample/ReceiptView.fxml"));
                scene = new Scene(root);
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("Shop Management");
                stage.setScene(scene);
                stage.show();
            }

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void btnACtion(ActionEvent e) {
        super.buttonAction(e);
    }
}
