package Lab8;

import lession9abstract.Employeeabstract;

import java.util.ArrayList;
import java.util.List;

public class Contest {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal squirrel = new Squirrel();
        Animal falcon = new Falcon();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(eagle);
        animalList.add(falcon);
        animalList.add(squirrel);

        System.out.println("Horse's speed is " + horse.getSpeed());
        System.out.println("Tiger's speed is " + tiger.getSpeed());
        System.out.println("Eagle's speed is " + eagle.getSpeed());
        System.out.println("Squirrel's speed is " + squirrel.getSpeed());
        System.out.println("Falcon's speed is " + falcon.getSpeed());

        Animal winner = checkCandidateAndDoContest(animalList);

        System.out.println("The winner is " + winner.getClass().getSimpleName());


    }

    static Animal checkCandidateAndDoContest(List<Animal> animalList) {
        Animal winner = null;
        for (Animal currentAnimal : animalList) {

            if (currentAnimal.flyable()) {
                System.out.println(currentAnimal.getClass().getSimpleName() + " is not qualified for the test");
            } else {
                if (winner == null) {
                    winner = currentAnimal;
                } else {
                    if (winner.getSpeed() < currentAnimal.getSpeed()) {
                        winner = currentAnimal;
                    }
                }

            }


        }
        return winner;
    }
}


