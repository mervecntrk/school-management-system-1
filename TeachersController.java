package school.management.schoolmanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TeachersController {


    @FXML
    private TableView<Teachers> tbData;

    @FXML
    public TableColumn<TeachersController, String> className_id;

    @FXML
    public TableColumn<TeachersController, String> firstName;

    @FXML
    public TableColumn<TeachersController, String> lastName;

    @FXML
    public void initialize() {
        className_id.setCellValueFactory(new PropertyValueFactory<>("classNameId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        tbData.setItems(teachers);
    }

    private final ObservableList<Teachers> teachers = FXCollections.observableArrayList(
            new Teachers("CENG 132", "andrew", "black"),
            new Teachers("CENG 124" , "sam" , "white"),
            new Teachers("CENG 213" , "bella " , "brown"));
    };

