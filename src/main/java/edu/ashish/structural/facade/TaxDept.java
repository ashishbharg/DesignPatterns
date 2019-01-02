package edu.ashish.structural.facade;

public class TaxDept {

    public int getIncomeTaxRate(double salary) {
        if (salary <= 250000) {
            return 0;
        } else if ( salary > 250000 && salary <= 500000) {
            return 10;
        } else if (salary > 500000 && salary <= 1000000) {
            return 20;
        }
        return 30;
    }

    public double calculateIncomeTax(int incomeTaxRate, double salary) {

        if (incomeTaxRate == 0) {
            return 0;
        } else if (incomeTaxRate == 10) {
            return salary - 250000 * (10 / 100);
        } else if (incomeTaxRate == 20) {
            return (250000 * (10 / 100)) + (salary - 500000 * (20 / 100));
        } else {
            return ((250000 * (10 / 100)) + (500000 * (20 / 100)) + (salary - 1000000 * (30 / 100)));
        }
    }
}
