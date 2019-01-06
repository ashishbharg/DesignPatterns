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
        String lineSeperator = System.lineSeparator();
        sb.append("public class " + getClassName());
        sb.append(lineSeperator);
        sb.append("{");
        sb.append(lineSeperator);
        for(Field field : this.fields) {
            sb.append(String.format("  public %s %s;%s", field.getDatatype(), field.getName(), lineSeperator));
        }
        sb.append("}");
        return sb.toString();
    }
}
