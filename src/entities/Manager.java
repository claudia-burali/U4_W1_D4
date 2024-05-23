package entities;

import enums.Department;

public class Manager extends Employee {
    private double bonus;
    public Manager(Department department, double bonus) {
        super(department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double paycheckCal() {
        return getPaycheck() + bonus;
    }
}
