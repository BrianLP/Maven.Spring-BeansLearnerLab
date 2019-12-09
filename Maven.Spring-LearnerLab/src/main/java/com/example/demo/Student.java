package com.example.demo;

public class Student extends Person implements Learner{

    double totaltudyTime;


    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totaltudyTime += numberOfHours;
    }

    public double getTotaltudyTime() {
        return totaltudyTime;
    }
}
