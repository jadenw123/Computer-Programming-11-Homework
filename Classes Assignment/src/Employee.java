public class Employee {

        private int id;
        private String firstName;
        private String lastName;
        private int salary;

    public Employee(int id, String firstName, String lastName, int salary){

    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
