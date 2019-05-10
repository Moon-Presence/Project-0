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





    @Override
    public void start(Stage primaryStage) throws Exception{

        for(int i =0;i<20;i++)
            CentralCore.unit[i]=new Model();

        CentralCore.map_gen();





        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1051, 692));

        //prepare();


        
        primaryStage.show();
        CentralCore.rendering1();


    }

    void prepare()throws Exception{
        Parent root1 = (Parent) FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Stage stage = new Stage();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(root1, 450, 450));
        stage.show();
/*
        MainMenu mm = new MainMenu();
        mm.ShowDialog();
        CentralCore.context = mm.d;

        switch (CentralCore.context)
        {
            case "ng":

                GS set = new GS();
                set.ShowDialog();
                N = set.N;
                for (int c = 0; c < N ; c++)
                    switch (c)
                    {
                        case 0: unit[0].Type = unit[10].Type = set.comboBox1.Text; break;
                        case 1: unit[1].Type = unit[11].Type = set.comboBox2.Text; break;
                        case 2: unit[2].Type = unit[12].Type = set.comboBox3.Text; break;
                        case 3: unit[3].Type = unit[13].Type = set.comboBox4.Text; break;
                        case 4: unit[4].Type = unit[14].Type = set.comboBox5.Text; break;
                        case 5: unit[5].Type = unit[15].Type = set.comboBox6.Text; break;
                        case 6: unit[6].Type = unit[16].Type = set.comboBox7.Text; break;
                        case 7: unit[7].Type = unit[17].Type = set.comboBox8.Text; break;
                        case 8: unit[8].Type = unit[18].Type = set.comboBox9.Text; break;
                        case 9: unit[9].Type = unit[19].Type = set.comboBox10.Text; break;

                    }
                set.Close();


                context = "deploy";

                Mb.Enabled = false;
                Stb.Enabled = false;
                W1b.Enabled = false;
                Sb.Enabled = false;
                W2b.Enabled = false; W2b.Visible = true;

                for (int c = 1; c < N + 1; c++)
                    switch (c)
                    {
                        case 1: u1.Enabled = true; break;
                        case 2: u2.Enabled = true; break;
                        case 3: u3.Enabled = true; break;
                        case 4: u4.Enabled = true; break;
                        case 5: u5.Enabled = true; break;
                        case 6: u6.Enabled = true; break;
                        case 7: u7.Enabled = true; break;
                        case 8: u8.Enabled = true; break;
                        case 9: u9.Enabled = true; break;
                        case 10: u10.Enabled = true; break;

                    }




                //Генерация карты
                for (int i = 0; i < 11; i++)
                    for (int j = 0; j < 19; j++)
                    {
                        if (r.Next(100) > 60)
                            switch (r.Next(10))
                            {
                                case 1:
                                case 2:
                                case 3:
                                case 4: a[i, j] = 't'; break;
                                case 5:
                                case 6:
                                case 7: a[i, j] = 'w'; break;
                                case 8:
                                case 9:
                                case 0: a[i, j] = 'r'; break;
                            }
                        else
                        {
                            a[i, j] = 'g';
                        }

                    }
                for (int i = 0; i < 11; i++)
                    for (int j = 0; j < 19; j++)
                        b[i, j] = ' ';
                a[5, 9] = 'p';


                RIGHT.Enabled = false;


                d_rendering();
                textBox1.Text = "Очередь прибытия юнитов в дислокацию:\r\n";
                for (int i = 0; i < N; i++)
                {
                    restoring(i, unit[i].Type);
                    restoring(i + 10, unit[i + 10].Type);
                    b_deploy(i + 10);
                }
                break;

            case "load":
                OpenFileDialog loadDialog = new OpenFileDialog();
                loadDialog.Filter = "Save files ( *.doc)| *.doc";
                if (loadDialog.ShowDialog() == DialogResult.OK)
                {
                    StreamReader fs = new StreamReader(loadDialog.FileName,Encoding.Default);
                    string buf1 = fs.ReadToEnd();
                    string[] buf =buf1.Split('~');
                    int c = 0;
                    for (int i = 0; i < 11; i++)
                        for (int j = 0; j < 19; j++)
                        { a[i, j] = Convert.ToChar(buf[c]); b[i, j] = Convert.ToChar(buf[c+209]); c++; }

                    pp = Convert.ToInt32(buf[418]);
                    bp = Convert.ToInt32(buf[419]);
                    round = Convert.ToInt32(buf[420]);
                    N = Convert.ToInt32(buf[421]); c=422;
                    if(pp > 10||bp > 10||round > 10||N > 10) { MessageBox.Show("Something go wrong. Please, try again!", "!!Error!!", MessageBoxButtons.OK); return; }

                    for (int i = 0; i < N; i++,c+=5)
                    {
                        if (buf[c ] != "nn" && buf[c+50] != "nn"&& (buf[c]=="Tank"|| buf[c] == "Jet" || buf[c] == "Art" || buf[c] == "Laser" || buf[c] == "Reaper" ||buf[c]=="Ghoust"))
                        {
                            restoring(i, buf[c]);
                            unit[i].Type=buf[c];
                            unit[i].HP = Convert.ToInt32(buf[ 1 + c]);
                            unit[i].AP = Convert.ToInt32(buf[ 2 + c]);
                            unit[i].I = Convert.ToInt32(buf[3 + c]);
                            unit[i].J = Convert.ToInt32(buf[4 + c]);
                            restoring(i+10, buf[c+50]);
                            unit[i+10].Type = buf[c+50];
                            unit[i+10].HP = Convert.ToInt32(buf[50 + 1 + c]);
                            unit[i+10].AP = Convert.ToInt32(buf[50 + 2 + c]);
                            unit[i+10].I = Convert.ToInt32(buf[50+ 3 + c]);
                            unit[i+10].J = Convert.ToInt32(buf[50+ 4 + c]);
                        }
                        else
                        { MessageBox.Show("Something go wrong. Please, try again!", "!!Error!!", MessageBoxButtons.OK); return; }

                    }
                }
                else
                { MessageBox.Show("Something go wrong. Please, try again!", "!!Error!!", MessageBoxButtons.OK); return; }
                Controller.TextBox1.setText ("Loading complete"); Controller.TextBox6.setText ( CentralCore.round + " Turn");

                b4.Enabled = true;
                b5.Enabled = true;
                b6.Enabled = true;
                b7.Enabled = true;
                b8.Enabled = true;
                b9.Enabled = true;
                b12.Enabled = true;
                b13.Enabled = true;
                b14.Enabled = true;
                b15.Enabled = true;
                b16.Enabled = true;
                b17.Enabled = true;
                b18.Enabled = true;
                b21.Enabled = true;
                b22.Enabled = true;
                b23.Enabled = true;
                b24.Enabled = true;
                b25.Enabled = true;
                b26.Enabled = true;
                b27.Enabled = true;
                b30.Enabled = true;
                b31.Enabled = true;
                b32.Enabled = true;
                b33.Enabled = true;
                b34.Enabled = true;
                b35.Enabled = true;
                b36.Enabled = true;
                b39.Enabled = true;
                b40.Enabled = true;
                b41.Enabled = true;
                b42.Enabled = true;
                b43.Enabled = true;
                b44.Enabled = true;
                b45.Enabled = true;
                b48.Enabled = true;
                b49.Enabled = true;
                b50.Enabled = true;
                b51.Enabled = true;
                b52.Enabled = true;
                b53.Enabled = true;
                b54.Enabled = true;
                b57.Enabled = true;
                b58.Enabled = true;
                b59.Enabled = true;
                b60.Enabled = true;
                b61.Enabled = true;
                b62.Enabled = true;
                b63.Enabled = true;

                CentralCore.rendering1();
                CentralCore.context = "select";break;
        } mm.Close();
        if (CentralCore.context == "exit") { MessageBox.Show("Something go wrong. Please, restart the programm!", "!!Error!!", MessageBoxButtons.OK); return; }
*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}
