package com.example.pillpal;

public class Time {
    private int value;
    private Medication.TimeUnit unit;

    public Time(int value, Medication.TimeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}