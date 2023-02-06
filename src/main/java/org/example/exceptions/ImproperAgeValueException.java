package org.example.exceptions;

public class ImproperAgeValueException extends Exception{ // extends IllegalArgumentException {
    public ImproperAgeValueException() {

    }

    public ImproperAgeValueException(String message,Throwable error) {

        super(message,error);
    }
    public ImproperAgeValueException(String message) {

        super(message);

    }
    public ImproperAgeValueException(Throwable message) {

        super(message);
    }
}
