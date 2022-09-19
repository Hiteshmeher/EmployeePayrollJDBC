package com.bridgelabz;

public class EmpPayroll {
    private int id;
    private String name;
    private double salary;

    /**
     * Constructors
     * @param id
     * @param name
     * @param salary
     */
    public EmpPayroll(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // toString methods
    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}