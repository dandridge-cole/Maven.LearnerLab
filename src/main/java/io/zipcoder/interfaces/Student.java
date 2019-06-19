package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }


    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    public void learn(double numHours){
        this.totalStudyTime+=numHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
