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


public class FrontPageController{

    @FXML
    private Button btnGenerate;
    @FXML
    private Button btnGenerate1;
    @FXML
    private Button btnGenerate2;



    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {

        Database.initialize();

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

    @FXML protected Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24;
    @FXML protected TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24;

    protected Integer counts1 = 0,counts2 = 0,counts3 = 0,counts4 = 0,counts5 = 0,counts6 = 0,counts7 = 0,counts8 = 0,counts9 = 0, counts10 = 0,counts11 = 0, counts12 = 0,counts13= 0, counts14 = 0, counts15 = 0,counts16 = 0,counts17 = 0,counts18 = 0,counts19 = 0,counts20 = 0,
            counts21 = 0,counts22 = 0,counts23 = 0,counts24 = 0;


    //txt1.setText(Integer.toString(Database.list.get(1).amount));
    @FXML
    protected void btnACtion(ActionEvent e) {
        if (e.getSource() == btn1)  {
            //counts1++;
            Database.list.get(1).amount++;
            txt1.setText(Integer.toString(Database.list.get(1).amount) );
        }
        if (e.getSource() == btn2)  {
            //counts2++;
            Database.list.get(2).amount++;
            txt2.setText(Integer.toString(Database.list.get(2).amount) );
        }
        if (e.getSource() == btn3)  {
            //counts3++;
            Database.list.get(3).amount++;
            txt3.setText(Integer.toString(Database.list.get(3).amount) );
        }
        if (e.getSource() == btn4)  {
            //counts4++;
            Database.list.get(4).amount++;
            txt4.setText(Integer.toString(Database.list.get(4).amount) );
        }
        if (e.getSource() == btn5)  {
            //counts5++;
            Database.list.get(5).amount++;
            txt5.setText(Integer.toString(Database.list.get(5).amount) );
        }
        if (e.getSource() == btn6)  {
            //counts6++;
            Database.list.get(6).amount++;
            txt6.setText(Integer.toString(Database.list.get(6).amount) );
        }
        if (e.getSource() == btn7)  {
            //counts7++;
            Database.list.get(7).amount++;
            txt7.setText(Integer.toString(Database.list.get(7).amount) );
        }
        if (e.getSource() == btn8)  {
            //counts8++;
            Database.list.get(8).amount++;
            txt8.setText(Integer.toString(Database.list.get(8).amount) );
        }
        if (e.getSource() == btn9)  {
            //counts9++;
            Database.list.get(9).amount++;
            txt9.setText(Integer.toString(Database.list.get(9).amount) );
        }
        if (e.getSource() == btn10)  {
            //counts10++;
            Database.list.get(10).amount++;
            txt10.setText(Integer.toString(Database.list.get(10).amount) );
        }
        if (e.getSource() == btn11)  {
            //counts11++;
            Database.list.get(11).amount++;
            txt11.setText(Integer.toString(Database.list.get(11).amount) );
        }
        if (e.getSource() == btn12)  {
            //counts12++;
            Database.list.get(12).amount++;
            txt12.setText(Integer.toString(Database.list.get(12).amount) );
        }
        if (e.getSource() == btn13)  {
            //counts13++;
            Database.list.get(13).amount++;
            txt13.setText(Integer.toString(Database.list.get(13).amount) );
        }
        if (e.getSource() == btn14)  {
            //counts14++;
            Database.list.get(14).amount++;
            txt14.setText(Integer.toString(Database.list.get(14).amount) );
        }
        if (e.getSource() == btn15)  {
            //counts15++;
            Database.list.get(15).amount++;
            txt15.setText(Integer.toString(Database.list.get(15).amount) );
        }
        if (e.getSource() == btn16)  {
            //counts16++;
            Database.list.get(16).amount++;
            txt16.setText(Integer.toString(Database.list.get(16).amount) );
        }
        if (e.getSource() == btn17)  {
            //counts17++;
            Database.list.get(17).amount++;
            txt17.setText(Integer.toString(Database.list.get(17).amount) );
        }
        if (e.getSource() == btn18)  {
            //counts18++;
            Database.list.get(18).amount++;
            txt18.setText(Integer.toString(Database.list.get(18).amount) );
        }
        if (e.getSource() == btn19)  {
            //counts19++;
            Database.list.get(19).amount++;
            txt19.setText(Integer.toString(Database.list.get(19).amount) );
        }
        if (e.getSource() == btn20)  {
            //counts20++;
            Database.list.get(20).amount++;
            txt20.setText(Integer.toString(Database.list.get(20).amount) );
        }
        if (e.getSource() == btn21)  {
            //counts21++;
            Database.list.get(21).amount++;
            txt21.setText(Integer.toString(Database.list.get(21).amount) );
        }
        if (e.getSource() == btn22)  {
            //counts22++;
            Database.list.get(22).amount++;
            txt22.setText(Integer.toString(Database.list.get(22).amount) );
        }
        if (e.getSource() == btn23)  {
            //counts23++;
            Database.list.get(23).amount++;
            txt23.setText(Integer.toString(Database.list.get(23).amount) );
        }
        if (e.getSource() == btn24) {
            //counts24++;
            Database.list.get(24).amount++;
            txt24.setText(Integer.toString(Database.list.get(24).amount) );
        }

    }
}