import java.util.ArrayList;

public class student {
    private String firstName;
    private static int id = 0;
    private int studentId;


    ArrayList<courses> courseList = new ArrayList<>();

    public student(String firstName){
        this.firstName = firstName;
        this.studentId = id;
        id++;

    }

    public void addCourseToArray(String subjectName, int studentGrade){
        courses course = new courses(subjectName, studentGrade);
        courseList.add(course);

    }

    public int averageStudentGrade(){
        int average = 0;
        for(int i = 0; i<courseList.size();i++){
            average += courseList.get(i).getStudentGrade();
        }
        return(average/8);

    }
    public void print() {
        for (int i = 0; i < 8; i++) {
            System.out.println(courseList.get(i));

        }

    }

    public String toString(){
        return "First Name: " + firstName + "Student Id: " + studentId;

    }


}
