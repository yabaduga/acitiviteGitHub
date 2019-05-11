package javacrm.zinovev;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class MainMenu {

    private static VBox vBox = new VBox();

    public MainMenu() {
        CreateGUI();
    }

    private void CreateGUI(){
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(10.0);
        Text headerMenu = new Text("Main Menu: ");
        Button dashBoardButton = new Button("Dash board");
        Button customersButton = new Button("Сustomers");
        Button ordersButton = new Button("Orders");
        Button goodsButton = new Button("Goods");
        this.vBox.getChildren().addAll(headerMenu, dashBoardButton, customersButton, ordersButton, goodsButton);
    }

    public static VBox getvBox() {
        return vBox;
    }
}
