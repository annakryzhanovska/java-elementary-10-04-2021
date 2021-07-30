package com.hillel.hometask10_23;


public enum OrderStatus {
    NEW("new"),
    IN_PROGRESS("in_progress"),
    FINISHED("finished"),
    FAILED("failed");

    String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
