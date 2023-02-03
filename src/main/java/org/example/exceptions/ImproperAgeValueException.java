package org.example.exceptions;

public class ImproperAgeValueException extends IllegalArgumentException {
    public ImproperAgeValueException() {
    }

    public ImproperAgeValueException(String message) {

        super(message);
    }
    public ImproperAgeValueException(Throwable message) {

        super(message);
    }
}
