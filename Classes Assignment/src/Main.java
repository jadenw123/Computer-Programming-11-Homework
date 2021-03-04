public class Main {
    public static void main(String[] args) {
        Employee Jef = new Employee(777777, "Jef", "Smith", 100000);
        System.out.println("id: " + Jef.getId());
        System.out.println("First Name: " + Jef.getFirstName());
        System.out.println("Last Name: " + Jef.getLastName());
        System.out.println("Salary: " + Jef.getSalary());
        Jef.setSalary(100000);
        System.out.println("Annual Salary: " + Jef.getAnnualSalary());
        System.out.println("Raise Salary: "+ Jef.raiseSalary(10));
        System.out.println(Jef);
    }

}
