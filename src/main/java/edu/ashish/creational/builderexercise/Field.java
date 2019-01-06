package edu.ashish.creational.builderexercise;

public class Field {

    private String name;

    private String datatype;

    public Field(String name, String datatype) {
        this.name = name;
        this.datatype = datatype;
    }

    public String getName() {
        return name;
    }

    public String getDatatype() {
        return datatype;
    }
}
