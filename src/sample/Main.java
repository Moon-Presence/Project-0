package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.Random;

public class Main extends Application {

    public static ProcessController CentralCore= new ProcessController();


    public static Stage myPrimStage;
    public static Stage setstage = new Stage();
    public static Stage menu = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{

        for(int i =0;i<20;i++)
            CentralCore.unit[i]=new Model();
        CentralCore.map_gen();
        myPrimStage=primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 1051, 692));

        setings();
    }

    public static void setings()throws Exception{
        Parent root1 = (Parent) FXMLLoader.load(Main.class.getResource("Settings.fxml"));
        setstage.setTitle("My New Stage Title");
        setstage.setScene(new Scene(root1, 404, 354));
        setstage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
