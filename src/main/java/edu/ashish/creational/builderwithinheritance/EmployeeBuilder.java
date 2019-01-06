package edu.ashish.creational.builderwithinheritance;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder withDesignation(String designation) {
        person.setDesignation(designation);
        return self();
    }

    public Person build() {
        return person;
    }

    protected EmployeeBuilder self() {
        return this;
    }
}
