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
import javafx.event.ActionEvent;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPass;

    public void login(ActionEvent event){
	try{
	    if(txtUserName.getText().equals("User") && txtPass.getText().equals("1234"))
		{
		    lblStatus.setText("Login Successful!");
		    Parent FrontPageController = FXMLLoader.load(getClass().getResource("/sample/FrontPage.fxml"));
		    Scene FrontPageScene = new Scene(FrontPageController);
		    Stage FrontPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		    FrontPageStage.setTitle("Shop Management");
		    FrontPageStage.setScene(FrontPageScene);
		    FrontPageStage.show();
		}
	    else throw new UsernameOrPasswordIsWrongException();
	} catch (IOException e){
	    System.out.println("An error has Occurred! "+ e.getMessage());
	} catch(UsernameOrPasswordIsWrongException e){
	    lblStatus.setText("Login Failed!");
	    System.out.println(e.getMessage());
	}
    }

    public void loadPreviousTransaction(ActionEvent event) throws Exception{
	Database.loadDatabase();
	//do fxml
	Parent root = FXMLLoader.load(getClass().getResource("/sample/AfterReceiptView.fxml"));
	Scene scene = new Scene(root);
	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	stage.setTitle("Shop Management");
	stage.setScene(scene);
	stage.show();
    }

       
}

