package com.example.demo;

import java.util.ArrayList;

public class Instuctor implements Teacher {
    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        ArrayList<Learner>students = new ArrayList<>();

        for (Learner learner : learners){
            students.add(learner);
        }
        Double numberOfHoursPerLearner = numberOfHours / students.size();

        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
