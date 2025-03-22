package projectofmine;

import java.time.LocalDate;

public class WorkoutSet {
    private double weight;
    private int reps;
    LocalDate date;
    private double burnedColories;
    public WorkoutSet(int reps, double weight, LocalDate date) {
        this.reps = reps;
        this.weight = weight;
        this.date = date;
    }

}
