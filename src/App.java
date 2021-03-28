import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start( Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("example.fxml"));
      primaryStage.setTitle("Example FXML Window");
      primaryStage.setScene(new Scene(root));

//      primaryStage.setWidth(200);
//      primaryStage.setHeight(200);

//      primaryStage.setResizable(false);//stały rozmiar okna
//        primaryStage.setFullScreen(true);
//        primaryStage.setX(0);
//        primaryStage.setY(0); //miejsce uruchomienia

//      primaryStage.initStyle(StageStyle.UNDECORATED);
      primaryStage.setOpacity(0.5); //przeźroczyste
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}