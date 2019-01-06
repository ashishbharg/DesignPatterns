package edu.ashish.creational.builderexercise;

import java.util.Map;

public class CodeBuilder
{

    private Class aClass;

    public CodeBuilder(String className)
    {
        aClass = new Class();
        aClass.setClassName(className);
    }

    public CodeBuilder addField(String name, String type)
    {
        aClass.addFields(name, type);
        return this;
    }

    @Override
    public String toString()
    {
        return aClass.toString();
    }
}
