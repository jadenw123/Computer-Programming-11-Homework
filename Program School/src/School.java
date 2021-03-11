import java.util.ArrayList;

public class School {
    private String door;
    private String room;
    private String table;

    ArrayList<Teacher> teacherArrayList = new ArrayList<>();

    ArrayList<Student> studentArrayList = new ArrayList<>();

    School(String door, String room, String table){
        this.door = door;
        this.room = room;
        this.table = table;
    }

    //add teacher
    public void addTeacherArrayList(String firstName, String lastName, String subject){
        Teacher teacher = new Teacher(firstName, lastName, subject);
        teacherArrayList.add(teacher);

    }

    //add student
    public void addStudentArrayList(String firstName, String lastName, int grade, int studentId){
        Student student = new Student(firstName, lastName, grade, studentId);
        studentArrayList.add(student);
    }

    //remove teacher
    public void removeTeacherArrayList(String firstName, String lastName, String subject){
        Teacher teacher = new Teacher(firstName, lastName, subject);
        teacherArrayList.remove(teacher);
    }

    //remove student
    public void removeStudentArrayList(String firstName, String lastName, int grade, int studentId){
        Student student = new Student(firstName, lastName, grade, studentId);
        studentArrayList.remove(student);
    }


    //show all teachers
    public void showAllTeacherArrayList(String firstName, String lastName, String subject){
        Teacher teacher = new Teacher(firstName, lastName, subject);
        System.out.println(teacherArrayList);
    }

    //show all students
    public void showAllTeacherArrayList(String firstName, String lastName, int grade, int studentId){
        Student student = new Student(firstName, lastName, grade, studentId);
        System.out.println(studentArrayList);
    }

    //add 10 students





}
