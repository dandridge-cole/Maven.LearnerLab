package io.zipcoder.interfaces;

final public class Instructors extends People<Instructor>{
    final private static Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
        Long nextId=1000L;
        super.add(new Instructor(nextId+=10, "Dolio"));
        super.add(new Instructor(nextId+=10, "Froilan"));
        super.add(new Instructor(nextId+=10, "Kris"));
        super.add(new Instructor(nextId, "Wilhem"));
    }

    public Instructor[] toArray(){
        return getInstance().toArray();
    }
}
