package entities;

import enums.Department;

import java.util.Random;

public abstract class Employee {
    private int id;
    private double paycheck;
    private Department department;

    public Employee(Department department) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.paycheck = rndm.nextDouble(1000, 1200);
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public double getPaycheck() {
        return paycheck;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public abstract double paycheckCal();
    @Override
    public String toString() {
        return "Employee [id=" + id + ", paycheck=" + paycheck + ", department=" + department + "]";
    }
}
