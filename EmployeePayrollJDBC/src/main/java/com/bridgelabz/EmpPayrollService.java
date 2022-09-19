package com.bridgelabz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmpPayrollService {
    /**
     *
     * @param args
     * connecting to Database
     */
    public static void main(String[] args) {
        // URL to my database
        String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll?useSSL=false";
        String user = "root";
        String password = "Sanjukta@01";
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        // list of drivers
        listDrivers();

        try{
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(jdbcURL,user,password);
            System.out.println("Connected...");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    // displaying method for list of drivers
    private static void listDrivers(){
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()){
            Driver driver = (Driver) driverList.nextElement();
            System.out.println(" "+ driver.getClass().getName());
        }
    }
}

