import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Bayaz on 7/11/2018.
 */
public class AlertBox {

    public static void display (String title, String message){

        Stage window2 = new Stage();
        window2.initModality(Modality.APPLICATION_MODAL);
        window2.setTitle(title);
        window2.setMinWidth(250);

        Label label2 = new Label(message);
        Button button2 = new Button("CLose this window");
        button2.setOnAction(event -> window2.close());
        VBox layout2 = new VBox(10);
        layout2.getChildren().addAll(label2,button2);
        layout2.setAlignment(Pos.CENTER);

        Scene scene2 = new Scene(layout2);
        window2.setScene(scene2);
        window2.showAndWait();








    }







}
