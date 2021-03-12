public class Student{

    private String firstName;
    private String lastName;
    private int grade;
    private int studentId;


    Student(String firstName, String lastName, int grade, int studentId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentId = studentId;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + lastName;
    }

    public int getGrade(){
        return grade;
    }

    public int getStudentId(){
        return studentId;
    }

    public String toString(){
        return "Name: " + getName() + "Grade: " + grade;
    }


}
