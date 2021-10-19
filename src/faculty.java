import java.io.Serializable;

public class faculty implements Serializable {
    private int facultyID;
    private String facultyName;
    private String salary;
    private course course;

    public faculty(int facultyID, String facultyName, String salary,course course) {
        this.setFacultyID(facultyID);
        this.setFacultyName(facultyName);
        this.setSalary(salary);
        this.course=course;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
