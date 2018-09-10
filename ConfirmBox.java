import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Bayaz on 7/12/2018.
 */
public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message){

        Stage window2 = new Stage();
        window2.setTitle(title);
        window2.setMinWidth(250);

        Label label = new Label(message);

        Button yesButton = new Button("Yess dana");
        yesButton.setOnAction(event -> {
            answer =true;
            window2.close();
        });

        Button noButton=new Button("Net da alaa");
        noButton.setOnAction(event -> {
            answer = false;
            window2.close();
        });
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(noButton,yesButton, label);
        layout2.setAlignment(Pos.CENTER);

        Scene scene2 =new Scene(layout2);
        window2.setScene(scene2);
        window2.showAndWait();

        return answer;


    }
}
