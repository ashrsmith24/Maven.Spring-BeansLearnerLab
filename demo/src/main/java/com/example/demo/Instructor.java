package com.example.demo;



import java.util.ArrayList;

public class Instructor extends Person implements Teacher {

    int numberOfHoursThatsTaught = 0;

    public Instructor(long id, String name) {
        super(id, name);

    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursThatsTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        ArrayList<Learner> learnersList = new ArrayList<>();
        learners.forEach(learner -> learnersList.add(learner));
        for (Learner learner : learners) {
            learner.learn(numberOfHours / learnersList.size());
        }
        numberOfHoursThatsTaught += numberOfHours;
    }
    public int getNumberOfHoursThatsTaught(){
        return numberOfHoursThatsTaught;
    }
}


