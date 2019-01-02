package edu.ashish.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayrollFacade {

    @Autowired
    private TaxDept taxDept;

    @Autowired
    private ReportGenerator reportGenerator;

    public void computeTax(Employee employee) {

        int incomeTaxRate = taxDept.getIncomeTaxRate(employee.getSalary());
        double incomeTaxPayable = taxDept.calculateIncomeTax(incomeTaxRate, employee.getSalary());
        reportGenerator.generateReport(employee, incomeTaxPayable);

    }
}
