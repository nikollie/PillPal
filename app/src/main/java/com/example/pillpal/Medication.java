package com.example.pillpal;
import java.util.List;

public class Medication {
    private String name;
    private String dose;
    private int timesPerDay;
    private MealTiming mealTiming;
    private String avoidSubstance;
    private int quantityLeft;
    private Time duration;
    private Time frequency;
    private DosageAdjustment dosageAdjustment;
    private List<String> notificationSchedules;

    // Constructors
    public Medication(String name, String dose, Time frequency, int timesPerDay,
                      MealTiming mealTiming, String avoidSubstance, int quantityLeft,
                      Time duration, DosageAdjustment dosageAdjustment,
                      List<String> notificationSchedules) {
        this.name = name;
        this.dose = dose;
        this.frequency = frequency;
        this.timesPerDay = timesPerDay;
        this.mealTiming = mealTiming;
        this.avoidSubstance = avoidSubstance;
        this.quantityLeft = quantityLeft;
        this.duration = duration;
        this.dosageAdjustment = dosageAdjustment;
        this.notificationSchedules = notificationSchedules;
    }

    // Getter and Setter methods

    // Additional methods as needed

    @Override
    public String toString() {
        // Customize how the Medication object is represented as a String (e.g., for debugging)
        return "Medication{name='" + name + "', dose='" + dose + "', frequency=" + frequency +
                ", timesPerDay=" + timesPerDay + ", mealTiming=" + mealTiming +
                ", avoidSubstance='" + avoidSubstance + "', quantityLeft=" + quantityLeft +
                ", duration=" + duration + ", dosageAdjustment=" + dosageAdjustment +
                ", notificationSchedules=" + notificationSchedules + '}';
    }

    // Nested Enums and Classes for better organization

    public enum MealTiming {
        BEFORE, AFTER, ANY
    }



    public static class DosageAdjustment {
        private int decreaseAmount;
        private int decreaseFrequency; // in days

        public DosageAdjustment(int decreaseAmount, int decreaseFrequency) {
            this.decreaseAmount = decreaseAmount;
            this.decreaseFrequency = decreaseFrequency;
        }

        @Override
        public String toString() {
            return "Decrease " + decreaseAmount + " every " + decreaseFrequency + " days";
        }
    }

    public enum TimeUnit {
        DAY, WEEK, MONTH
    }
}
