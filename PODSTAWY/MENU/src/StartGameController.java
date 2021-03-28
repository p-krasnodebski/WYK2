import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class StartGameController {

    private MainController mainController;

    @FXML
    private ToggleGroup Group1;

    @FXML
    void backToMenu() {
      mainController.loadMenuScreen();

    }
    public void setMainController(MainController mainController){
      this.mainController = mainController;
    }

}
