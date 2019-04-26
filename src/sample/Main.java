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


    //unit[0]=new Model();

    Random r = new Random();


    @Override
    public void start(Stage primaryStage) throws Exception{

        for(int i =0;i<20;i++)
            CentralCore.unit[i]=new Model();


        //Генерация карты
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 19; j++)
            {
                if (r.nextInt(100) > 60)
                    switch (r.nextInt(10))
                    {
                        case 1:
                        case 2:
                        case 3:
                        case 4: CentralCore.a[i][ j] = 't'; break;
                        case 5:
                        case 6:
                        case 7: CentralCore.a[i][ j] = 'w'; break;
                        case 8:
                        case 9:
                        case 0: CentralCore.a[i][ j] = 'r'; break;
                    }
                else
                {
                    CentralCore.a[i][ j] = 'g';
                }

            }
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 19; j++)
                CentralCore.b[i][ j] = ' ';
        CentralCore.a[5][ 9] = 'p';



        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1051, 692));
        primaryStage.show();

        CentralCore.rendering1();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
