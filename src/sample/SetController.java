package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.SwipeEvent;


public class SetController {

    @FXML
    private Label Label;

    @FXML
    private Slider Slider;

    @FXML
    private ComboBox<String> CB1;

    @FXML
    private ComboBox<String> CB6;

    @FXML
    private ComboBox<String> CB2;

    @FXML
    private ComboBox<String> CB7;

    @FXML
    private ComboBox<String> CB3;

    @FXML
    private ComboBox<String> CB8;

    @FXML
    private ComboBox<String> CB4;

    @FXML
    private ComboBox<String> CB9;

    @FXML
    private ComboBox<String> CB5;

    @FXML
    private ComboBox<String> CB10;

    @FXML
    private Button Button;

    @FXML
    void Swipe(SwipeEvent event) {
        Label.setText("Units in squad: "+Slider.getValue());
    }

    @FXML
    void Click(ActionEvent event) {
        Main.CentralCore.N=(int)Slider.getValue();
        for(int i =0;i<Main.CentralCore.N;i++){
            Main.CentralCore.unit[i].Type= String.valueOf(ComBox[i].getValue());
            Main.CentralCore.unit[i+10].Type= String.valueOf(ComBox[i].getValue());
        }


        Main.CentralCore.context = "deploy";

        Controller.Mb.setDisable(true);
        Controller.W1b.setDisable(true);
        Controller.Sb. setDisable(true);
        Controller.Stb.setDisable(true);
        Controller.W2b.setDisable(true); Controller.W2b.setVisible(true);

        for (int i = 0; i < Main.CentralCore.N; i++){
                Controller.U[i].setDisable(false);
            }


        Controller.Rightb.setDisable(true);


        Main.CentralCore.d_rendering();
        Controller.TextBox1.setText( "Очередь прибытия юнитов в дислокацию:\r\n");
        for (int i = 0; i < Main.CentralCore.N; i++)
        {
            Main.CentralCore.restoring(i, Main.CentralCore.unit[i].Type);
            Main.CentralCore.restoring(i + 10, Main.CentralCore.unit[i + 10].Type);
            Main.CentralCore.b_deploy(i + 10);
        }

        for(int i=0;i<7;i++)
            for(int j =2;j<9;j++){
                Controller.fg[i*9+j].setDisable(true);
            }

        Main.myPrimStage.show();
        Main.setstage.hide();
    }

    @FXML
    public ComboBox ComBox[]= new ComboBox[10];


    @FXML
    public void initialize(){
        initialization();
    }
    public void initialization() {
        for (int i =0;i<10;i++)
            ComBox[i]=new ComboBox<String>();
        ComBox[0]=CB1;
        ComBox[1]=CB2;
        ComBox[2]=CB3;
        ComBox[3]=CB4;
        ComBox[4]=CB5;
        ComBox[5]=CB6;
        ComBox[6]=CB7;
        ComBox[7]=CB8;
        ComBox[8]=CB9;
        ComBox[9]=CB10;
        ObservableList<String> list = FXCollections.observableArrayList("Tank","Jet","Reaper","Art", "Laser", "Ghoust");
        for(int i =0;i<10;i++){
            ComBox[i].setDisable(false);
            ComBox[i].setValue("Tank");
            ComBox[i].setItems(list);
            if(i!=0)ComBox[i].setDisable(true);
        }
        Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                Label.setText("Units in squad: "+(int)Slider.getValue());
                for(int i =0;i <10;i++) {
                    ComBox[i].setDisable((i<(int)Slider.getValue())? false:true);
                }
            }
        });

    }

}