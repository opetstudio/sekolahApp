package com.opetstudio.sekolah;/**
 * Created by opetstudio on 10/7/16.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Button btn = new Button("Click Me");
//        btn.setOnAction(e -> btn_click());
//
//        StackPane frame = new StackPane();
//        frame.getChildren().add(btn);
//
//        Scene scene = new Scene(frame,200,50);
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Hello world!");
//        primaryStage.show();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    public void btn_click() {
        System.out.println("You clicked the button");
    }


}
