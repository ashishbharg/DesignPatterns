package edu.ashish.creational.builderwithinheritance;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person;

    public PersonBuilder() {
        person = new Employee();
    }

    public SELF withName(String name) {
        person.setName(name);
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}
