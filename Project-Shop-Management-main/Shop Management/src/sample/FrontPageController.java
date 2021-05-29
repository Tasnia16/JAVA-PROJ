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


    protected void btnACtion(ActionEvent e) {
        if (e.getSource() == btn1)  {
            counts1++;
            txt1.setText(counts1.toString());
        }
        if (e.getSource() == btn2)  {
            counts2++;
            txt2.setText(counts2.toString());
        }
        if (e.getSource() == btn3)  {
            counts3++;
            txt3.setText(counts3.toString());
        }
        if (e.getSource() == btn4)  {
            counts4++;
            txt4.setText(counts4.toString());
        }
        if (e.getSource() == btn5)  {
            counts5++;
            txt5.setText(counts5.toString());
        }
        if (e.getSource() == btn6)  {
            counts6++;
            txt6.setText(counts6.toString());
        }
        if (e.getSource() == btn7)  {
            counts7++;
            txt7.setText(counts7.toString());
        }
        if (e.getSource() == btn8)  {
            counts8++;
            txt8.setText(counts8.toString());
        }
        if (e.getSource() == btn9)  {
            counts9++;
            txt9.setText(counts9.toString());
        }
        if (e.getSource() == btn10)  {
            counts10++;
            txt10.setText(counts10.toString());
        }
        if (e.getSource() == btn11)  {
            counts11++;
            txt11.setText(counts11.toString());
        }
        if (e.getSource() == btn12)  {
            counts12++;
            txt12.setText(counts12.toString());
        }
        if (e.getSource() == btn13)  {
            counts13++;
            txt13.setText(counts13.toString());
        }
        if (e.getSource() == btn14)  {
            counts14++;
            txt14.setText(counts14.toString());
        }
        if (e.getSource() == btn15)  {
            counts15++;
            txt15.setText(counts15.toString());
        }
        if (e.getSource() == btn16)  {
            counts16++;
            txt16.setText(counts16.toString());
        }
        if (e.getSource() == btn17)  {
            counts17++;
            txt17.setText(counts17.toString());
        }
        if (e.getSource() == btn18)  {
            counts18++;
            txt18.setText(counts18.toString());
        }
        if (e.getSource() == btn19)  {
            counts19++;
            txt19.setText(counts19.toString());
        }
        if (e.getSource() == btn20)  {
            counts20++;
            txt20.setText(counts20.toString());
        }
        if (e.getSource() == btn21)  {
            counts21++;
            txt21.setText(counts21.toString());
        }
        if (e.getSource() == btn22)  {
            counts22++;
            txt22.setText(counts22.toString());
        }
        if (e.getSource() == btn23)  {
            counts23++;
            txt23.setText(counts23.toString());
        }
        if (e.getSource() == btn24) {
            counts24++;
            txt24.setText(counts24.toString());
        }

    }
}
