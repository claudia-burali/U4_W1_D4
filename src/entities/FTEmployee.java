import entities.Employee;
import enums.Department;

public class FTEmployee extends Employee {
    public FTEmployee(Department department) {
        super(department);
    }

    @Override
    public double paycheckCal() {
        return getPaycheck();
    }
}
