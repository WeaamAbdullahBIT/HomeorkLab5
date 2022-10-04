public class EmployeeTester {
    public static void main (String[] args) {
        Employee eyad = new      Employee("harry", 5000);
        System.out.println("Employee Name: "+eyad.getName());
        System.out.println("Employee Salary: "+eyad.getSalary());
        eyad.raiseSalary(10);
        System.out.println("Reise Salary: "+eyad.getSalary());

    }
}
