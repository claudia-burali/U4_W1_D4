package entities;

import enums.Department;

public class PTEmployee extends Employee{
    private int oreLavorate;
    private double pagaOraria;

    public PTEmployee(Department department, int oreLavorate, double pagaOraria) {
        super(department);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }
    public int getOreLavorate() {
        return oreLavorate;
    }
    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }
    public double getPagaOraria() {
        return pagaOraria;
    }
    public void setPagaOraria(double pagaOraria) {
        this.pagaOraria = pagaOraria;
    }
    @Override
    public double paycheckCal() {
        return oreLavorate * pagaOraria;
    }
}
