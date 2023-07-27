package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import util.TestData;

public class Main extends Application {

    private static Stage stg;

    public static void main(String[] args) {


        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stg=stage;

        Parent prnt= FXMLLoader.load(getClass().getResource("/main.fxml"));
        Scene scn=new Scene(prnt);
        stg.setScene(scn);
        stg.show();




    }
}
