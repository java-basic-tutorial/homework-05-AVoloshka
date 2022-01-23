package com.softserveinc.task01;

public class NotMoneyEnoughException extends IllegalArgumentException {
    public NotMoneyEnoughException() {
    }

    public NotMoneyEnoughException(String s) {
        super(s);
    }

    public NotMoneyEnoughException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotMoneyEnoughException(Throwable cause) {
        super(cause);
    }
}