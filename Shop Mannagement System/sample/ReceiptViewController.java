package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;


public class ReceiptViewController implements Initializable{
    @FXML
    private ListView<String> myListView;

    @FXML
    private Label priceLabel;

    @FXML
    private ObservableList<String> itemList;

    private double price = 0;
    public void initialize(URL arg0, ResourceBundle arg1){
	itemList = FXCollections.observableArrayList();
	for(int index=0; index<Database.numberOfProducts; index++){
	    if(Database.list.get(index).amount!=0){
		itemList.add(Database.generateString(index));
		price+=(Database.list.get(index).price * Database.list.get(index)
		    .amount);	    }
	}

	myListView.setItems(itemList);
	priceLabel.setText("Total Price: "+ Double.toString(price)+" Tk");
    }
}
