package edu.ashish.creational.builderexercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Class {

    private String className;

    private List<Field> fields;

    public Class() {
        fields = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void addFields(String fieldName, String datatype) {
        this.fields.add(new Field(fieldName, datatype));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = System.lineSeparator();
        sb.append("public class " + getClassName());
        sb.append(lineSeparator);
        sb.append("{");
        sb.append(lineSeparator);
        for(Field field : this.fields) {
            sb.append(String.format("  public %s %s;%s", field.getDatatype(), field.getName(), lineSeparator));
        }
        sb.append("}");
        return sb.toString();
    }
}
