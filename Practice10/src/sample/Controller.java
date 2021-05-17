package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    
    @FXML
    public Label label1;

    @FXML
    public TextField input;

    public void method(){
        System.out.println("Java Fx");
        String t = input.getText();
        label1.setText("Hello Java Fx -> "+t);
    }


    public void method1(){
        System.out.println("Hello");
    }
}
