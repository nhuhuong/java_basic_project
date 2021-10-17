package Lession06Abstract;

public class SolarEnergyRobotCat extends RobotCat{
    public SolarEnergyRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public SolarEnergyRobotCat() {

    }

    public void runSolarEnergy(){
        System.out.println("runwithSolar");
    }

    @Override
    public void charge() {
        super.charge();
        System.out.println("with solar energy....");
    }
}
