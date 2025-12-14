package school.management.schoolmanagementsystem;

import javafx.beans.property.SimpleStringProperty;

public class Teachers {

    private SimpleStringProperty className_id;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;

    public Teachers(String className_id, String firstName, String lastName){
        this.className_id = new SimpleStringProperty(className_id);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getClassName_id() {return className_id.get();}

    public void setClassName_id(String className_id) {
        this.className_id = new SimpleStringProperty();
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty();
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty();
    }
}
