package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StartController {

    @FXML
    private Button NG;

    @FXML
    private Button LG;

    @FXML
    void loadGame(MouseEvent event)throws  Exception {
    //Main.CentralCore.load();
    Main.menu.hide();
}

    @FXML
    void newGame(MouseEvent event )throws Exception {
        Main.setings();
        Main.menu.hide();
    }

}
