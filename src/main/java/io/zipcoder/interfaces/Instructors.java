package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        this.addPerson(new Instructor(100L, "Leon"));
        this.addPerson(new Instructor(101L, "Kris"));
        this.addPerson(new Instructor(102L, "Dolio"));

    };
    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray() {
        return new Instructor[0];
    }
}
