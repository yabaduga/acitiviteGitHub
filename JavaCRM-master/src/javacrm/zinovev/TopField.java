package javacrm.zinovev;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TopField {

    private static HBox hBox = new HBox();

    public TopField(){
        CreateGUI();
    }

    private void CreateGUI(){
        final TextField iD = new TextField();
        iD.setPromptText("Id");
        iD.setMaxWidth(UserTabelView.getIdColumn().getPrefWidth());
        final TextField name = new TextField();
        name.setMaxWidth(UserTabelView.getNamelColumn().getPrefWidth());
        name.setPromptText("First Name");
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(UserTabelView.getEmailColumn().getPrefWidth());
        addEmail.setPromptText("E-mail");
        final TextField addPhoneNumber = new TextField();
        addPhoneNumber.setMaxWidth(UserTabelView.getPhoneNumberColumn().getPrefWidth());
        addPhoneNumber.setPromptText("Phone Number");

        Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                UserTabelView.getUsersData().add(new User(
                        Integer.valueOf(iD.getText()),
                        name.getText(),
                        addEmail.getText(),
                        Long.valueOf(addPhoneNumber.getText())
                ));
                iD.clear();
                name.clear();
                addEmail.clear();
                addPhoneNumber.clear();
            }
        });
        Button removeButton = new Button("Remove");
        removeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                User selectedItem = UserTabelView.getTableUsers().getSelectionModel().getSelectedItem();
                UserTabelView.getTableUsers().getItems().remove(selectedItem);
            };
        });

        final TextField search = new TextField();
        search.setPromptText("search");
        search.setMaxWidth(UserTabelView.getIdColumn().getPrefWidth());
        Button searchButton = new Button("Searche");
        hBox.getChildren().addAll(iD, name, addEmail, addPhoneNumber, addButton, removeButton, search, searchButton);
        hBox.setAlignment(Pos.CENTER);
    }

    public static HBox gethBox() {
        return hBox;
    }
}
