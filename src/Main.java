import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<department> departments=new ArrayList<>();
    static  ArrayList<course> courses=new ArrayList<>();
    static  ArrayList<faculty> faculties =new ArrayList<>();
    static ArrayList<student> students=new ArrayList<>();

    public static void main(String[] args) {


departmentData();
courseData();
facultyData();
studentData();
saveData(departments,courses,faculties,students);
readData();










    //    int SID;
//
//
//        String name;
//        int age;
//        String email;
//        String address;
//        String mob;
//        String department;
//        int stage;
//        String group;
//        double mark;
//        boolean isParallel;
//        String yon;
//        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter your ID: ");
        // SID = scan.nextInt();
        // System.out.print("Enter your name: ");
        // name = scan.next();
        // System.out.print("Enter your age: ");
        // age = scan.nextInt();
        // System.out.print("Enter your email: ");
        // email = scan.next();
        // System.out.print("Enter your address: ");
        // address = scan.next();
        // System.out.print("Enter your mob: ");
        // mob = scan.next();
        // System.out.print("Enter your department: ");
        // department = scan.next();
        // System.out.print("Enter your stage: ");
        // stage = scan.nextInt();
        // System.out.print("Enter your group: ");
        // group = scan.next();
        // System.out.print("are you parallel student?: ");
        // yon = scan.next();
        // isParallel = yon == "yes" ? true : false;


    }
    static void departmentData(){

////////////////////////////////////////Department Data////////////////////////////////////////////////////
        departments.add(new department(1,"Architecture"));
        departments.add(new department(2,"Software"));
        departments.add(new department(3,"Civil"));
        departments.add(new department(4,"Electrical"));
        departments.add(new department(5,"mechanical"));
        }
        static void courseData(){
            ////////////////////////////////////////Course Data///////////////////////////////////////////////////////
            courses.add(new course(1,"OOP",6,departments.get(1)));
            courses.add(new course(2,"DataBase",5,departments.get(1)));
            courses.add(new course(3,"Web design",4,departments.get(1)));
            courses.add(new course(4,"Mobile Application",4,departments.get(1)));
        }
        static void facultyData(){
            ////////////////////////////////////////faculty Data/////////////////////////////////////////////////////
            faculties.add(new faculty(1,"Polla","1500$",courses.get(0)));
            faculties.add(new faculty(2,"hanan","1400$",courses.get(1)));
            faculties.add(new faculty(3,"imad","1200$",courses.get(2)));
            faculties.add(new faculty(4,"agreen","1300$",courses.get(3)));
        }
        static void studentData(){
            ////////////////////////////////////////student Data/////////////////////////////////////////////////////
            students.add(new student(1,"San",21,"sansamir2001@yahoo.com","ankawa","1234567890",departments.get(1),false));
            students.add(new student(2,"melissa",21,"melissa@yahoo.com","ankawa","1234567890",departments.get(1),false));
            students.add(new student(3,"azher",21,"azher@yahoo.com","erbil","1234567890",departments.get(1),false));
        }
        static void saveData(ArrayList<department> d,ArrayList<course> c,ArrayList<faculty> f,ArrayList<student> s){
            try {

                ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\San\\OneDrive\\Desktop\\College.txt"));

                obj.writeObject(s);
                obj.writeObject(c);
                obj.writeObject(f);
                obj.writeObject(d);

                obj.close();

            }catch(Exception e){System.out.println(e);}
        }
        static void readData(){
            try{
                ObjectInputStream objin=new ObjectInputStream(new FileInputStream("C:\\Users\\San\\OneDrive\\Desktop\\College.txt"));
System.out.println(objin.readObject().toString());


                    objin.close();

                } catch(Exception e){
                System.out.println(e);
            }
        }

}

