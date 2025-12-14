package school.management.schoolmanagementsystem;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Classes {

    private SimpleStringProperty classId;
    private SimpleStringProperty className;

    public Classes(String classId, String className){
        this.classId = new SimpleStringProperty(classId);
        this.className = new SimpleStringProperty(className);
    }


    public String getClassId() {
        return classId.get();
    }

    public void setClassId(String firstName) {
        this.classId = new SimpleStringProperty();
    }

    public String getClassName() {
        return className.get();
    }

    public void setClassName(String className) {
        this.className = new SimpleStringProperty();
    }
}

