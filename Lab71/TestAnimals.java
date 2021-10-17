package Lab71;


import java.util.ArrayList;
import java.util.List;

public class TestAnimals {
    public static void main(String[] args) {
        Animals horse = new Animals.Builder().flyAble(false).speed(100).name("horse").build();
        Animals tiger = new Animals.Builder().flyAble(false).speed(200).name("tiger").build();
        Animals goose = new Animals.Builder().flyAble(false).speed(10).name("goose").build();
        Animals eagle = new Animals.Builder().flyAble(true).speed(300).name("eagle").build();
        Animals bear = new Animals.Builder().flyAble(false).speed(100).name("bear").build();

        List<Animals> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(goose);
        animalList.add(eagle);
        animalList.add(bear);

        System.out.println("Horse's speed is " + horse.getSpeed());
        System.out.println("Tiger's speed is " + tiger.getSpeed());
        System.out.println("Eagle's speed is " + eagle.getSpeed());
        System.out.println("Goose's speed is " + goose.getSpeed());
        System.out.println("Bear's speed is " + bear.getSpeed());

        Animals winner = checkCandidateAndDoContest(animalList);

        System.out.println("The winner is " + winner.getName());


    }



    static Animals checkCandidateAndDoContest(List<Animals> animalList) {
        Animals winner = null;
        for (Animals currentAnimal : animalList) {

            if (currentAnimal.getFlyAbleStatus()) {
                System.out.println(currentAnimal.getName() + " is not qualified for the test");
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
