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
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class FrontPageController implements Initializable{
    
    @FXML
    private Button grocery;
    @FXML
    private Button food;
    @FXML
    private Button cleaning;


        
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource()==grocery){
	    root  = FXMLLoader.load(getClass().getResource("/sample/Grocery.fxml"));
            scene = new Scene(root);
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Shop Management");
            stage.setScene(scene);
            stage.show();
       }
        else if(event.getSource()==food){
	    root  = FXMLLoader.load(getClass().getResource("/sample/Food.fxml"));
            scene = new Scene(root);
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Shop Management");
            stage.setScene(scene);
            stage.show();

                    }
        else if(event.getSource()==cleaning){
	    root  = FXMLLoader.load(getClass().getResource("/sample/Cleaning.fxml"));
            scene = new Scene(root);
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Shop Management");
            stage.setScene(scene);
            stage.show();

                    }
    }
         
    @FXML
    protected TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24;
    protected TextField[]  textFieldArray;
    protected boolean visited = false;
    
    public void initialize(URL arg0, ResourceBundle arg1){
	 textFieldArray = new TextField[] {txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24};

	 Database.initialize();
	 Database.numberOfProducts=72;
    }
    protected void buttonAction(ActionEvent event){
	Button button = (Button)(event.getSource());
	String[] temp_arr = button.getText().split("\\(");
	String productName = temp_arr[0];
	
	int store_value=0;
	int index = Database.getIndex(productName);
	try{
	    if(index!=-1){
		Database.list.get(index).amount++;
		if(Database.list.get(index).amount>10) throw new OutOfStockException(productName);
	    }
	}catch(OutOfStockException e){
	    Database.list.get(index).amount--;
	    System.out.println(e.getMessage());
	}finally{
	    
	    if(0<=index && index<24) {textFieldArray[index].setText(Integer.toString(Database.list.get(index).amount));store_value=0;}
	    else if(24<=index && index<48) {textFieldArray[index-24].setText(Integer.toString(Database.list.get(index).amount)); store_value=24;}
	    else if(48<=index && index<72) {textFieldArray[index-48].setText(Integer.toString(Database.list.get(index).amount)); store_value=48;}
	    
	    for(int i=0; i<24; i++) textFieldArray[i].setText(Integer.toString(Database.list.get(i+store_value).amount));
	}
    }

}
