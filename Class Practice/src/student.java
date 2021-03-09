import java.util.ArrayList;

public class student {
    private String firstName;
    private static int id = 0;
    private int studentId;
    private int average = 0;
    private int add = 0;



    ArrayList<courses> courseList = new ArrayList<>();

    public student(String firstName){
        this.firstName = firstName;
        this.studentId = id;
        id++;

    }

    public void addCourseToArray(String subjectName, String studentGrade){
        courses course = new courses(subjectName, studentGrade);
        courseList.add(course);

    }

    public void averageStudentGrade(average = add/8){

    }





}
