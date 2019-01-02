package edu.ashish.structural.facade;

public class ReportGenerator {

    public void generateReport(Employee employee, double incomeTaxPayable) {

        System.out.println("Income Tax Report");
        System.out.println("Employee: " + employee.getName());
        System.out.println("You need to pay tax amount Rs. " + incomeTaxPayable);
    }
}
