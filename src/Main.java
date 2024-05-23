import entities.Employee;
import entities.Manager;
import entities.PTEmployee;
import enums.Department;

public class Main {
        public static void main(String[] args) {
                Employee[] employees = new Employee[3];

                employees[0] = new FTEmployee(Department.PRODUZIONE);
                employees[1] = new PTEmployee(Department.AMMINISTRAZIONE, 200, 8.5);
                employees[2] = new Manager(Department.VENDITE, 750);

                for (Employee employee : employees) {
                        System.out.println("Id: " + employee.getId() + " paycheck: " + employee.paycheckCal());
                }
                double Total = 0.0;
                for (Employee employee : employees) {
                        double paycheck = employee.paycheckCal();
                        Total += paycheck;
                }
                System.out.println("Total: " + Total);
        }
}
