package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textName;
    public TextField textAge;
    public TextField textHeight;
    public ListView<Friend> listFriends = new ListView<>();
    public Label labelName;
    public Label labelAge;
    public Label labelHeight;
    public Button buttonFriend;

    public void addFriend(ActionEvent actionEvent) {
        String name = textName.getText();
        double height = Double.parseDouble(textHeight.getText());
        int age = Integer.parseInt(textAge.getText());
        Friend friend = new Friend(name, age, height);
        listFriends.getItems().add(friend);
        textHeight.clear();
        textAge.clear();
        textName.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        labelName.setText("Name: " + friend.getName());
        String height = Double.toString(friend.getHeight());
        labelHeight.setText("Height: " + height + " cm");
        String age = Integer.toString(friend.getAge());
        labelAge.setText("Age: " + age);

    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null){
            return;
        }
        listFriends.getItems().remove(friend);
        labelName.setText("Name: ");
        labelAge.setText("Age: ");
        labelHeight.setText("Height: ");
    }
}
