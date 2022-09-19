package com.bridgelabz;

public class EmpPayroll {
    private int id;
    private String name;
    private String address;

    /**
     * Constructors
     * @param id
     * @param name
     * @param address
     */
    public EmpPayroll(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    // toString methods
    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + address +
                '}';
    }
}
