package javacrm.zinovev;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage primaryStage;
    private MainMenu mainMenu = new MainMenu();
    private UserTabelView tableUsers = new UserTabelView();
    private TopField topField = new TopField();

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        CreateGUI();
    }

    public static void main(String[] args) {
        launch(Main.class, args);
    }

    private void CreateGUI(){
        BorderPane pane = new BorderPane();
        pane.setLeft(MainMenu.getvBox());
        pane.setCenter(UserTabelView.getTableUsers());
        pane.setTop(TopField.gethBox());
        Scene scene = new Scene(pane, 800, 400);
        this.primaryStage.setTitle("Java CRM ");
        this.primaryStage.setScene(scene);
        this.primaryStage.centerOnScreen();
        this.primaryStage.show();
    }
}
