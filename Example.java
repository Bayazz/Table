import javafx.application.Application;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Example extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX - thenewboston");

        TreeItem<String> root, bbb, ccc;

        root = new TreeItem<>();
        root.setExpanded(true);

        bbb = createItem ("Umweltanalytik", root);
        createItem("Partikelmesstechnik", bbb);
        createItem("Chem.Analytik", bbb);

        tree = new TreeView<>(root);

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
    }

    public TreeItem<String>  createItem(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


}