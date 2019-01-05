package edu.ashish.principles.ocp;

/**
 * This is example of specification pattern.
 * @param <T>
 */
public interface Specification<T> {

    boolean isSatisfied(T item);
}
