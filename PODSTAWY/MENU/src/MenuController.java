import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;


public class MenuController {

    private MainController mainController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void End(ActionEvent event) {

    }

    @FXML
    void howTo(ActionEvent event) {

    }

    @FXML
    void openApplication(ActionEvent event) {
      FXMLLoader loader = new FXMLLoader(this.getClass().getResource("StartGameScreen.fxml"));
      Pane pane = null;
      try {
        pane = loader.load();
        } catch (IOException e) {
          e.printStackTrace();
        
        }
        StartGameController startGameController = loader.getController();
        startGameController.setMainController(mainController);
        mainController.setScreen(pane);


    }

    @FXML
    void initialize() {

    }

    public void setMainController(MainController mainController){
      this.mainController = mainController;
    }
}
