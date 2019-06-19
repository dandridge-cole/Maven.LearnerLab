package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    DOLIO(new Instructor(1010L, "Dolio"), 0.0),
    FROILAN(new Instructor(1020L, "Froilan"), 0.0),
    KRIS(new Instructor(1030L, "Kris"), 0.0),
    WILHEM(new Instructor(1040L, "Wilhem"), 0.0);

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
