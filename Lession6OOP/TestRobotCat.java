package Lession06Abstract;

public class TestRobotCat {
    public static void main(String[] args) {
        BatteryRobotCat batteryRobotCat = new BatteryRobotCat("batteryRbotCat","10/08/2021");
        batteryRobotCat.setBatteryType("AAA");
        System.out.println(batteryRobotCat.getName());
        batteryRobotCat.runWithBattery();
        batteryRobotCat.charge();

        System.out.println("=================");

        SolarEnergyRobotCat solarEnergyRobotCat = new SolarEnergyRobotCat("solarEnery","04/05/2022");
        System.out.println(batteryRobotCat.getName());
        solarEnergyRobotCat.runSolarEnergy();
        solarEnergyRobotCat.charge();


    }
}
