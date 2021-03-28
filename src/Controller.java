import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClick;

    @FXML
    private DatePicker date;

    @FXML
    private ColorPicker colorPic;

    @FXML
    void handleButtonAction(ActionEvent event) {
      
      System.out.println("Button is clicled on comp.  " + event.getSource());
      if(event.getSource() instanceof Button ){
        System.out.println("To checkbox.");
      }

    }

    @FXML
    void handleColorPicS(ActionEvent event) {

    }

    @FXML
    void handleDate(ActionEvent event) {

    }

    @FXML
    void initialize() { //wywoływana zaraz po konstruktorze, zmiana właściwości obiektów.
        assert btnClick != null : "fx:id=\"btnClick\" was not injected: check your FXML file 'example.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'example.fxml'.";
        assert colorPic != null : "fx:id=\"colorPic\" was not injected: check your FXML file 'example.fxml'.";

    }
}
