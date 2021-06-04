package sample;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

class OutOfStockException extends Exception{
    OutOfStockException(String productName){
	super(productName + "is out of stock!");
	alertWindow(productName);
    }
    private void alertWindow(String productName){
	Alert a = new Alert(Alert.AlertType.WARNING);
	a.setTitle("Out Of Stock");
	a.setContentText("We are out of stock for " + productName);
	a.setHeaderText(null);
	a.showAndWait();
    }
}
