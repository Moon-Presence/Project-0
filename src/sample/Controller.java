package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ImageView bg21;

    @FXML
    private ImageView bg22;

    @FXML
    private ImageView bg23;

    @FXML
    private ImageView bg24;

    @FXML
    private ImageView bg25;

    @FXML
    private ImageView bg26;

    @FXML
    private ImageView bg19;

    @FXML
    private ImageView bg20;

    @FXML
    private ImageView bg27;

    @FXML
    private ImageView bg30;

    @FXML
    private ImageView bg31;

    @FXML
    private ImageView bg32;

    @FXML
    private ImageView bg33;

    @FXML
    private ImageView bg34;

    @FXML
    private ImageView bg35;

    @FXML
    private ImageView bg28;

    @FXML
    private ImageView bg29;

    @FXML
    private ImageView bg36;

    @FXML
    private ImageView bg39;

    @FXML
    private ImageView bg40;

    @FXML
    private ImageView bg41;

    @FXML
    private ImageView bg42;

    @FXML
    private ImageView bg43;

    @FXML
    private ImageView bg44;

    @FXML
    private ImageView bg37;

    @FXML
    private ImageView bg38;

    @FXML
    private ImageView bg45;

    @FXML
    private ImageView bg48;

    @FXML
    private ImageView bg49;

    @FXML
    private ImageView bg50;

    @FXML
    private ImageView bg51;

    @FXML
    private ImageView bg52;

    @FXML
    private ImageView bg53;

    @FXML
    private ImageView bg46;

    @FXML
    private ImageView bg47;

    @FXML
    private ImageView bg54;

    @FXML
    private ImageView bg57;

    @FXML
    private ImageView bg58;

    @FXML
    private ImageView bg59;

    @FXML
    private ImageView bg60;

    @FXML
    private ImageView bg61;

    @FXML
    private ImageView bg62;

    @FXML
    private ImageView bg55;

    @FXML
    private ImageView bg56;

    @FXML
    private ImageView bg63;

    @FXML
    private ImageView bg12;

    @FXML
    private ImageView bg13;

    @FXML
    private ImageView bg14;

    @FXML
    private ImageView bg15;

    @FXML
    private ImageView bg16;

    @FXML
    private ImageView bg17;

    @FXML
    private ImageView bg10;

    @FXML
    private ImageView bg11;

    @FXML
    private ImageView bg18;

    @FXML
    private ImageView bg3;

    @FXML
    private ImageView bg4;

    @FXML
    private ImageView bg5;

    @FXML
    private ImageView bg6;

    @FXML
    private ImageView bg7;

    @FXML
    private ImageView bg8;

    @FXML
    private ImageView bg1;

    @FXML
    private ImageView bg2;

    @FXML
    private ImageView bg9;

    @FXML
    private ImageView BackGroundPictureBlock;

    @FXML
    private TextArea TextArea1;

    @FXML
    private Button Right;

    @FXML
    private TextArea TextArea3;

    @FXML
    private Button Down;

    @FXML
    private Button Left;

    @FXML
    private Button Up;

    @FXML
    private TextField TextArea5;

    @FXML
    private TextField TextArea4;

    @FXML
    private TextArea TextArea2;

    @FXML
    private TextArea TextArea6;

    @FXML
    private ImageView fg21;

    @FXML
    private ImageView fg22;

    @FXML
    private ImageView fg23;

    @FXML
    private ImageView fg24;

    @FXML
    private ImageView fg25;

    @FXML
    private ImageView fg26;

    @FXML
    private ImageView fg19;

    @FXML
    private ImageView fg20;

    @FXML
    private ImageView fg27;

    @FXML
    private ImageView fg30;

    @FXML
    private ImageView fg31;

    @FXML
    private ImageView fg32;

    @FXML
    private ImageView fg33;

    @FXML
    private ImageView fg34;

    @FXML
    private ImageView fg35;

    @FXML
    private ImageView fg28;

    @FXML
    private ImageView fg29;

    @FXML
    private ImageView fg36;

    @FXML
    private ImageView fg39;

    @FXML
    private ImageView fg40;

    @FXML
    private ImageView fg41;

    @FXML
    private ImageView fg42;

    @FXML
    private ImageView fg43;

    @FXML
    private ImageView fg44;

    @FXML
    private ImageView fg37;

    @FXML
    private ImageView fg38;

    @FXML
    private ImageView fg45;

    @FXML
    private ImageView fg48;

    @FXML
    private ImageView fg49;

    @FXML
    private ImageView fg50;

    @FXML
    private ImageView fg51;

    @FXML
    private ImageView fg52;

    @FXML
    private ImageView fg53;

    @FXML
    private ImageView fg46;

    @FXML
    private ImageView fg47;

    @FXML
    private ImageView fg54;

    @FXML
    private ImageView fg57;

    @FXML
    private ImageView fg58;

    @FXML
    private ImageView fg59;

    @FXML
    private ImageView fg60;

    @FXML
    private ImageView fg61;

    @FXML
    private ImageView fg62;

    @FXML
    private ImageView fg55;

    @FXML
    private ImageView fg56;

    @FXML
    private ImageView fg63;

    @FXML
    private ImageView fg12;

    @FXML
    private ImageView fg13;

    @FXML
    private ImageView fg14;

    @FXML
    private ImageView fg15;

    @FXML
    private ImageView fg16;

    @FXML
    private ImageView fg17;

    @FXML
    private ImageView fg10;

    @FXML
    private ImageView fg11;

    @FXML
    private ImageView fg18;

    @FXML
    private ImageView fg3;

    @FXML
    private ImageView fg4;

    @FXML
    private ImageView fg5;

    @FXML
    private ImageView fg6;

    @FXML
    private ImageView fg7;

    @FXML
    private ImageView fg8;

    @FXML
    private ImageView fg1;

    @FXML
    private ImageView fg2;

    @FXML
    private ImageView fg9;

    @FXML
    private ImageView PictureBlock;

    @FXML
    void Down_Click(MouseEvent event) {
        if(Main.CentralCore.A != 4){ Main.CentralCore.A++;TextBox4.setText(""+Main.CentralCore.A);}
        if (Main.CentralCore.context == "deploy") Main.CentralCore.d_rendering(); else Main.CentralCore.rendering1();
    }

    @FXML
    void Left_Click(MouseEvent event) {
        if(Main.CentralCore.B != 0){ Main.CentralCore.B--;TextBox5.setText(""+Main.CentralCore.B);}
        if (Main.CentralCore.context == "deploy") Main.CentralCore.d_rendering(); else Main.CentralCore.rendering1();
    }

    @FXML
    void Right_Click(MouseEvent event) {
        if(Main.CentralCore.B != 10){ Main.CentralCore.B++;TextBox5.setText(""+Main.CentralCore.B);}
        if (Main.CentralCore.context == "deploy") Main.CentralCore.d_rendering(); else Main.CentralCore.rendering1();
    }

    @FXML
    void Up_Click(MouseEvent event) {
        if(Main.CentralCore.A != 0){ Main.CentralCore.A--;TextBox4.setText(""+Main.CentralCore.A);}
        if (Main.CentralCore.context == "deploy") Main.CentralCore.d_rendering(); else Main.CentralCore.rendering1();
    }


    @FXML
    void Field_click(MouseEvent event) {
        Main.CentralCore.coordinate_i=((int)event.getSceneY()-63)/64+Main.CentralCore.A;
        Main.CentralCore.coordinate_j=((int)event.getSceneX()-195)/64+Main.CentralCore.B;
        Main.CentralCore.reaction();
    }


    @FXML
    public static  TextArea TextBox1= new TextArea();
    @FXML
    public static TextArea TextBox2= new TextArea();
    @FXML
    public static TextArea TextBox3= new TextArea();
    @FXML
    public static TextField TextBox4= new TextField ();
    @FXML
    public static TextField  TextBox5= new TextField ();
    @FXML
    public static TextArea TextBox6= new TextArea();

    @FXML
    public static ImageView[]fg= new ImageView[63];
    @FXML
    public static ImageView[]bg= new ImageView[63];
    @FXML
    public static ImageView pb= new ImageView();
    @FXML
    public static ImageView bgpb= new ImageView();
    @FXML
    void Click(MouseEvent event) {
        Main.CentralCore.rendering1();

    }


    @FXML
    public void initialize(){
        initialization();
    }
    public void initialization() {

        bgpb=BackGroundPictureBlock;
        pb=PictureBlock;

        TextBox1=TextArea1;
        TextBox2=TextArea2;
        TextBox3=TextArea3;
        TextBox6=TextArea6;
        TextBox5=TextArea5;
        TextBox4=TextArea4;

        fg = new ImageView[63];

        fg[0] = fg1;
        fg[1] = fg2;
        fg[2] = fg3;
        fg[3] = fg4;
        fg[4] = fg5;
        fg[5] = fg6;
        fg[6] = fg7;
        fg[7] = fg8;
        fg[8] = fg9;
        fg[9] = fg10;
        fg[10] = fg11;
        fg[11] = fg12;
        fg[12] = fg13;
        fg[13] = fg14;
        fg[14] = fg15;
        fg[15] = fg16;
        fg[16] = fg17;
        fg[17] = fg18;
        fg[18] = fg19;
        fg[19] = fg20;
        fg[20] = fg21;
        fg[21] = fg22;
        fg[22] = fg23;
        fg[23] = fg24;
        fg[24] = fg25;
        fg[25] = fg26;
        fg[26] = fg27;
        fg[27] = fg28;
        fg[28] = fg29;
        fg[29] = fg30;
        fg[30] = fg31;
        fg[31] = fg32;
        fg[32] = fg33;
        fg[33] = fg34;
        fg[34] = fg35;
        fg[35] = fg36;
        fg[36] = fg37;
        fg[37] = fg38;
        fg[38] = fg39;
        fg[39] = fg40;
        fg[40] = fg41;
        fg[41] = fg42;
        fg[42] = fg43;
        fg[43] = fg44;
        fg[44] = fg45;
        fg[45] = fg46;
        fg[46] = fg47;
        fg[47] = fg48;
        fg[48] = fg49;
        fg[49] = fg50;
        fg[50] = fg51;
        fg[51] = fg52;
        fg[52] = fg53;
        fg[53] = fg54;
        fg[54] = fg55;
        fg[55] = fg56;
        fg[56] = fg57;
        fg[57] = fg58;
        fg[58] = fg59;
        fg[59] = fg60;
        fg[60] = fg61;
        fg[61] = fg62;
        fg[62] = fg63;

        bg = new ImageView[63];

        bg[0] = bg1;
        bg[1] = bg2;
        bg[2] = bg3;
        bg[3] = bg4;
        bg[4] = bg5;
        bg[5] = bg6;
        bg[6] = bg7;
        bg[7] = bg8;
        bg[8] = bg9;
        bg[9] = bg10;
        bg[10] = bg11;
        bg[11] = bg12;
        bg[12] = bg13;
        bg[13] = bg14;
        bg[14] = bg15;
        bg[15] = bg16;
        bg[16] = bg17;
        bg[17] = bg18;
        bg[18] = bg19;
        bg[19] = bg20;
        bg[20] = bg21;
        bg[21] = bg22;
        bg[22] = bg23;
        bg[23] = bg24;
        bg[24] = bg25;
        bg[25] = bg26;
        bg[26] = bg27;
        bg[27] = bg28;
        bg[28] = bg29;
        bg[29] = bg30;
        bg[30] = bg31;
        bg[31] = bg32;
        bg[32] = bg33;
        bg[33] = bg34;
        bg[34] = bg35;
        bg[35] = bg36;
        bg[36] = bg37;
        bg[37] = bg38;
        bg[38] = bg39;
        bg[39] = bg40;
        bg[40] = bg41;
        bg[41] = bg42;
        bg[42] = bg43;
        bg[43] = bg44;
        bg[44] = bg45;
        bg[45] = bg46;
        bg[46] = bg47;
        bg[47] = bg48;
        bg[48] = bg49;
        bg[49] = bg50;
        bg[50] = bg51;
        bg[51] = bg52;
        bg[52] = bg53;
        bg[53] = bg54;
        bg[54] = bg55;
        bg[55] = bg56;
        bg[56] = bg57;
        bg[57] = bg58;
        bg[58] = bg59;
        bg[59] = bg60;
        bg[60] = bg61;
        bg[61] = bg62;
        bg[62] = bg63;
    }






}
