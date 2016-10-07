package com.opetstudio.sekolah;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by opetstudio on 10/7/16.
 */
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        log.debug("sayHelloWorld");
        helloWorld.setText("Hellow World!");
    }
}
