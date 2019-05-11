package javacrm.zinovev;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserTabelView {

    private static TableView<User> tableUsers =  new TableView();;
    private static TableColumn<User, Integer> idColumn;
    private static TableColumn<User, String> nameColumn;
    private static TableColumn<User, String> emailColumn;
    private static TableColumn<User, Long> phoneNumberColumn;

    private static ObservableList<User> usersData = FXCollections.observableArrayList();

    public UserTabelView(){
        CreateGUI();
    }

    private void CreateGUI(){
        idColumn = new TableColumn("id");
        nameColumn = new TableColumn("Name");
        emailColumn = new TableColumn("E-mail");
        phoneNumberColumn = new TableColumn("Phone Number");
        idColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<User, Long>("phoneNumber"));
        tableUsers.getColumns().addAll(idColumn, nameColumn, emailColumn, phoneNumberColumn);
        initData();
        tableUsers.setEditable(true);
        tableUsers.setItems(usersData);
    }

    public static TableView<User> getTableUsers() {
        return tableUsers;
    }

    public static TableColumn<User, Integer> getIdColumn() {
        return idColumn;
    }

    public static TableColumn<User, String> getNamelColumn() {
        return nameColumn;
    }

    public static TableColumn<User, String> getEmailColumn() {
        return emailColumn;
    }

    public static TableColumn<User, Long> getPhoneNumberColumn() {return phoneNumberColumn; }

    public void initData() {
        usersData.add(new User(1, "Alex Alexov", "alex@mail.com", 9347568));
        usersData.add(new User(2, "Bob Bobson", "bob@mail.com", 8765432));
        usersData.add(new User(3, "Jeck Jacobson", "Jeck@mail.com", 9081234));
        usersData.add(new User(4, "Mike Milel", "mike@mail.com", 7964326));
        usersData.add(new User(5, "Colin Colins", "colin@mail.com", 7659012));
    }

    public static ObservableList<User> getUsersData(){
        return usersData;
    }
}
