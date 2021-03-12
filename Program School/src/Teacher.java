public class Teacher{
    private String firstName;
    private String lastName;
    private String subject;


    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSubject() {
        return subject;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return "First Name: " + firstName + "Last Name: " + lastName + "Subject: " + subject;

    }


}
