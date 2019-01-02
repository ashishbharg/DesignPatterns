package edu.ashish.structural.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This facade avoids the interaction of different sub-systems which could lead to complex sub-system.
 * Instead it simplifies the subsystem by exposing a public API in facade class which can acts as interactive
 * layer with other systems. Client is usually provided this facade class through which it can work across different
 * sub-systems.
 */
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
