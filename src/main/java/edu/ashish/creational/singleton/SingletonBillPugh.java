package edu.ashish.creational.singleton;

/**
 * The following approach of creating Singleton class is lazy initialized and this takes care of multithreading
 * scenario where multiple threads can break Singleton class. It uses static inner class which gets initialized
 * only when getInstance is called from outside.
 */
public class SingletonBillPugh {

    private SingletonBillPugh() {

    }

    public static SingletonBillPugh getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {

        public static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
}
