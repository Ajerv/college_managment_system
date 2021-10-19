import java.io.Serializable;

public class course implements Serializable {
    private int courseNo;
    private String courseName;
    private int numberOfCredit;
    private department department;


    public course(int courseNo, String courseName, int numberOfCredit,department department) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.numberOfCredit = numberOfCredit;
        this.department=department;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

}
