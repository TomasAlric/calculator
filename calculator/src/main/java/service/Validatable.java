package service;

public interface Validatable<T> {

    boolean isValid(T input);
}