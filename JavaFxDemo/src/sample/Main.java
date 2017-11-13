package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application /*implements EventHandler*/ {

    Button button;

    Scene scene1,scene2;
    Button button1,button2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My First JavaFx Program");
        //primaryStage.setScene(new Scene(root, 300, 275));

        Label label1=new Label("Welcome to JavaFx");



        button1 = new Button();
        button1.setText("Click Me to go to scene2");

        button1.setOnAction(e -> primaryStage.setScene(scene2));

        VBox layout1 =new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 300, 300);



        button2 = new Button();
        button2.setText("Click Me to go to scene1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));

        StackPane layout2=new StackPane();
        layout2.getChildren().add(button2);
        scene2=new Scene(layout2,600,300);

        primaryStage.setScene(scene1);
        primaryStage.show();


       // button.setOnAction(this);
        /*button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Info");
                alert.setHeaderText("Here's a Message");
                alert.setContentText("You just clicked on My First JavaFx Program button  ;)");
                alert.show();
            }
        });*/

        /*button.setOnAction(e -> {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alert title");
            alert.setHeaderText("Header text");
            alert.setContentText("Content text");
            alert.show();
        });*/


        /*StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 300);




        primaryStage.setScene(scene);
        primaryStage.show();*/
    }

   /* @Override
    public void handle(Event event) {
        if (event.getSource()==button){
            System.out.println("You just clicked on My First JavaFx Program button");
        }
    }*/
}
