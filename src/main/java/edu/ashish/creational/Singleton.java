package edu.ashish.creational;

import java.io.Serializable;

/**
 * Program to show Singleton design pattern. It will load properties during start-up and assuming
 * once loaded it will not be changed. This approach is easily beatable when reflections comes into picture.
 * If reflection too needs to be take care, then go for Enums. Enums handle multithreading, reflections,
 * serialization and cloning scenarios internally. The only issue is Enums are eager loaded.
 */
public class Singleton implements Serializable, Cloneable {

    private static volatile Singleton _instance = null;

    private Singleton() {

        if (_instance != null) {
            throw new IllegalStateException("Singleton object is already created.");
        }
    }

    /**
     * This method returns single instance of the class. This method is implemented using double locking mechanism.
     * This takes care of any singleton break during multithreading.
     * @return
     */
    public static Singleton getInstance() {

        if(_instance == null) {
            synchronized (Singleton.class) {
                if(_instance == null) {
                    _instance = new Singleton();
                }
            }
        }

        return _instance;
    }

    // readResolve is the last method which gets called during deserialization. Hence, this takes care of
    // deserialization process.
    protected Object readResolve() {
        return _instance;
    }

    /**
     * This method will help in returning the same instance when clone is called. However, it depends
     * if wants to throw CloneNotSupportedException or to return back the same instance.
     * @return
     */
    @Override
    public Object clone() {
        return _instance;
    }

}
