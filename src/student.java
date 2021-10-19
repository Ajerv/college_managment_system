import java.io.Serializable;

public class student implements Serializable {
    private  int SID;
    private String name;
    private int age;
    private String email;
    private String address;
    private String mob;
    private department department;
    private int stage;
    private double mark = 0;
    private boolean isParallel;
    course c1;

    public student(int SID, String name, int age, String email, String address, String mob, department department,
              boolean isParallel) {
        this.SID = SID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.mob = mob;
        this.department = department;
        this.stage = 1;


        

    }

    public void takeCourse(course c1) {
        this.c1 = c1;
    }


    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    void setSID(int newSID) {
        this.SID = newSID;
    }

    int getSID() {
        return this.SID;
    }

    void setName(String newName) {
        this.name = newName;
    }

    String getName() {
        return this.name;
    }

    void setage(int newAge) {
        this.age = newAge;
    }

    int getAge() {
        return this.age;
    }

    void setEmail(String newEmail) {
        this.email = newEmail;
    }

    String getEmail() {
        return this.email;
    }

    void setAddress(String newAddress) {
        this.address = newAddress;
    }

    String getAddress() {
        return this.address;
    }

    void setMob(String newMob) {
        this.mob = newMob;
    }

    String getMob() {
        return this.mob;
    }

    void setDepartment(department newDepartment) {
        this.department = newDepartment;
    }

    department getDepartment() {
        return this.department;
    }

    void setStage(int newStage) {
        this.stage = newStage;
    }

    int getStage() {
        return this.stage;
    }

    @Override
    public String toString() {
        return "\nStudent Information\nStudent ID: " + this.SID + "\nStudent name: " + this.name;
    }

}