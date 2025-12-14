package school.management.schoolmanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {

    @FXML
    private TableView<Students> tbData;

    @FXML
    public TableColumn<Students, Integer> studentId;

    @FXML
    public TableColumn<Students, String> firstName;

    @FXML
    public TableColumn<Students, String> lastName;



    private final ObservableList<Students> students = FXCollections.observableArrayList(
            new Students(1,"patric", "jane"),
            new Students(2, "micheal", "scofield"),
            new Students(3, "jesse", "pinkman"),
            new Students(4, "spencer", "reid")
    );

}
