package sample;

import sample.SetController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application  {

    public static ProcessController CentralCore= new ProcessController();


    public static Stage myPrimStage;
    public static Stage setstage = new Stage();

    @Override
    public void start(Stage primaryStage) {

        for(int i =0;i<20;i++)
            CentralCore.unit[i]=new Model();
        CentralCore.map_gen();
        myPrimStage=primaryStage;

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 1051, 692));

        setings();
    }

    public static void setings(){
        Parent root1 = null;
        try {
            root1 = (Parent) FXMLLoader.load(Main.class.getResource("Settings.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setstage.setTitle("My New Stage Title");
        setstage.setScene(new Scene(root1, 404, 354));
        setstage.show();
    }

    public static void main(String[] args)  {
        launch(args);
    }
}
