package Lab91;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Animals horse1 = new Horse();
        Animals horse2 = new Horse();

        Animals elephant1 = new Elephant();
        Animals elephant2 = new Elephant();

        Animals tiger1 = new Tiger();
        Animals tiger2 = new Tiger();

        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(horse1);
        animalsList.add(horse2);
        animalsList.add(elephant1);
        animalsList.add(elephant2);
        animalsList.add(tiger1);
        animalsList.add(tiger2);

        //Animals winner = checkCandidateAndDoContest(animalsList);

        System.out.printf("speed" + tiger1.getSpeed());
        System.out.printf("speed" + elephant1.getSpeed());
        System.out.printf("speed" + horse1.getSpeed());

        int totalRacing = 10;
        int totalElephantWinner = 0;
        int totalTigerWinner = 0;
        int totalHorseWinner = 0;

        while (totalRacing !=0){
            Animals winner = checkCandidateAndDoContest(animalsList);
            if (winner.simpleName() == "Elephant"){
                totalElephantWinner +=1;
            }else if (winner.simpleName() == "Tiger"){
                totalTigerWinner +=1;
            }else{
                totalHorseWinner +=1;
            }
            totalRacing -= 1;
        }

        System.out.printf("Elephant " + totalElephantWinner);
        System.out.printf("Horse " + totalHorseWinner);
        System.out.printf("Tiger " + totalTigerWinner);




    }

    static Animals checkCandidateAndDoContest(List<Animals> animalList) {
        Animals winner = null;
        for (Animals currentAnimal : animalList) {
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.getSpeed() < currentAnimal.getSpeed()) {
                    winner = currentAnimal;
                }
            }
        }
        return winner;
    }
}
