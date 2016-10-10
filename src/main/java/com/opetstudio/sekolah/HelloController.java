package com.opetstudio.sekolah;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by opetstudio on 10/7/16.
 */
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    public Label helloWorld;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup.
    @FXML private Text actiontarget;

    public void sayHelloWorld(ActionEvent actionEvent) {
        log.debug("sayHelloWorld");
        helloWorld.setText("Hellow World!");
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent actionEvent) {
        log.debug("signin submited");
        actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign in button pressed");
    }
}
