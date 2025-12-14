package school.management.schoolmanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController {

    @FXML
    private TableView<Students> tbData;

    @FXML
    public TableColumn<Students, Integer> studentId;

    @FXML
    public TableColumn<Students, String> firstName;

    @FXML
    public TableColumn<Students, String> lastName;

    @FXML
    private TableView<Classes> tbData2;

    @FXML
    public TableColumn<Classes, String> classId;

    @FXML
    public TableColumn<Classes, String> className;

    @FXML
    public void initialize() {
        loadStudents();
        loadClasses();
    }


    private final ObservableList<Students> studentModels = FXCollections.observableArrayList(
            new Students(1,"patric", "jane"),
            new Students(2, "micheal", "scofield"),
            new Students(3, "jesse", "pinkman"),
            new Students(4, "spencer", "reid")
    );

    private void loadStudents() {
        studentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tbData.setItems(studentModels);

    }

    private final ObservableList<Classes> classes = FXCollections.observableArrayList(
            new Classes("CENG 123", "computer"),
            new Classes("CENG 132", "computer")
    );

    private void loadClasses() {
        classId.setCellValueFactory(new PropertyValueFactory<>("classId"));
        className.setCellValueFactory(new PropertyValueFactory<>("className"));



    }
}
