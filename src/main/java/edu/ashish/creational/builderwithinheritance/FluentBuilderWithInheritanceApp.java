package edu.ashish.creational.builderwithinheritance;

public class FluentBuilderWithInheritanceApp {

    public static void main(String[] args) {
        Person person = new EmployeeBuilder().withName("Ashish").withDesignation("Manager").build();

        System.out.println(person);
    }
}
