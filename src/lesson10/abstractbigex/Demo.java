package lesson10.abstractbigex;

public class Demo {
    private Employee[] employees = new Employee[100];

    void paySalaryToEmployee() {
        for (Employee employee : employees) {
            employee.peySalary();
            System.out.println("Salary was paid succesful to " + employee.getName() + "employee");
        }
    }
}
