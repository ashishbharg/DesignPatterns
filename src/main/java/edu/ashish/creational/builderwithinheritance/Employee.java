package edu.ashish.creational.builderwithinheritance;

public class Employee extends Person {

    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                "designation='" + designation + '\'' +
                '}';
    }
}
