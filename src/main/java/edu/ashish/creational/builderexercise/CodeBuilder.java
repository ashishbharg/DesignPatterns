package edu.ashish.creational.builderexercise;

/**
 * Design builder pattern such that output should be as below:
 *
 * public class Person
 * {
 *   public String name;
 *   public int age;
 * }
 */
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
