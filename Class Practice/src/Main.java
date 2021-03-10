public class Main {
    public static void main(String[] args) {
        student student = new student("Jef");
        student.addCourseToArray("English",95);
        student.addCourseToArray("Math", 80);
        student.addCourseToArray("Social Studies", 90);
        student.addCourseToArray("Physics", 75);
        student.addCourseToArray("Chemistry", 60);
        student.addCourseToArray("Film", 86);
        student.addCourseToArray("Programming", 85);
        student.addCourseToArray("Physical Education", 87);
        System.out.println(student.averageStudentGrade());
        student.print();
    }
}
