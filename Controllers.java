package school.management.schoolmanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controllers {

    @FXML
    Button btnDashboard;

    @FXML
    Button btnStudents;

    @FXML
    Button btnClasses;

    @FXML
    Button btnTeachers;




    public void initialize() {
        btnDashboard.setOnAction(event -> loadStage("Dashboard.fxml"));
        btnStudents.setOnAction(event -> loadStage("Students.fxml"));
        btnClasses.setOnAction(event -> loadStage("Classes.fxml"));
        btnTeachers.setOnAction(event -> loadStage("Teachers.fxml"));
    }

    private void loadStage(String fxml) {
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
            System.err.println("error loading fxml file: " + fxml);
        }
    }



}
