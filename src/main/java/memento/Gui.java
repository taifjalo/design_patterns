package memento;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Gui extends Application {

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;
    private ListView history;


    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);
        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);
        Button historyButton = new Button("History");
        history = new ListView();


        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        //HBox historyBox = new HBox(history);
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);



        historyButton.setOnMouseClicked(event->{
            Stage historyStage = new Stage();
            Scene historyScene = new Scene(history);
            historyStage.setScene(historyScene);
            historyStage.show();
            historyScene.setOnKeyPressed(evt -> {
                if (evt.isControlDown() && evt.getCode() == KeyCode.Z) {
                    // Ctrl-Z: undo
                    System.out.println("Undo key combination pressed");
                    controller.undo();
                } else if (evt.isControlDown() && evt.getCode() == KeyCode.Y) {
                    System.out.println("Redo key combination pressed");
                    controller.redo();

                }
            });




        });
       history.setOnMouseClicked(event->{
           String selecedItem = history.getSelectionModel().getSelectedItem().toString();
           for (int i =0 ; i<history.getItems().size();i++){
               if(history.getItems().get(i).toString().equals(selecedItem)){
                   controller.restoreState(i);
                   updateGui();
                   break;
           }



       }

        });
        Label label = new Label("Press Ctrl-Z to undo the last change, CTRL-Y to redo.");
        label.setPadding(insets);

        // create a VBox that contains the HBox and the CheckBox
        VBox vBox = new VBox(historyButton,hBox, checkBox, label);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                // Ctrl-Z: undo
                System.out.println("Undo key combination pressed");
                controller.undo();
            } else if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                System.out.println("Redo key combination pressed");
                controller.redo();

            }
        });



        stage.setScene(scene);
        stage.setTitle("Memento Pattern Example");
        stage.show();
    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());
        history.setItems(controller.getHistory());

    }
}