public class courses {
    private String subjectName;
    private int studentGrade;

    public courses(String subjectName, int studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

        public int getStudentGrade() {
            return studentGrade;
        }

        public String toString() {
            return "Subject Name: " + subjectName + " |Student Grade: " + studentGrade;
        }


    }


