import java.io.Serializable;
import java.util.ArrayList;

public class department implements Serializable {
    private int departmentID;
    private String dpeartmentName;
     ArrayList<student> students=new ArrayList<>();
    course[] courses;

    department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.dpeartmentName = departmentName;

    }

    public String getDpeartmentName() {
        return dpeartmentName;
    }

    public void setDpeartmentName(String dpeartmentName) {
        this.dpeartmentName = dpeartmentName;
    }
}
