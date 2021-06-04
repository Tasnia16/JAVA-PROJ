package sample;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

class UsernameOrPasswordIsWrongException extends Exception{
    UsernameOrPasswordIsWrongException(){
	super("Username or Password is Wrong!");
	alertWindow();
    }
    private void alertWindow(){
	Alert a = new Alert(Alert.AlertType.WARNING);
	a.setTitle("Wrong Credentials");
	a.setContentText("You have entered wrong username or password!");
	a.setHeaderText(null);
	a.showAndWait();
    }
}
