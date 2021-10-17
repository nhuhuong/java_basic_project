package Lession06Abstract;

import java.security.SecureRandom;

public class TestRobotDog {
    public static void main(String[] args) {

        //System.out.println(RobotDog.getDefaultName());

        //RobotDog robotDog1 = new RobotDog("lulu");
        //System.out.println("robotDong1 " + robotDog1.getDogID());
       // robotDog1.getDefaultName();

        //RobotDog robotDog2 = new RobotDog("Micky");
        //System.out.println("robotDong1 " + robotDog2.getDogID());

        BatteryDog batteryDog = new BatteryDog("lulu");
        System.out.println(BatteryDog.getDefaultName());

        SolarEnergyDog solarEnergyDog = new SolarEnergyDog("lulu1");
        System.out.println(solarEnergyDog.getDefaultName());

        int randomSpeed = new SecureRandom().nextInt(50);
        System.out.println(randomSpeed);

        System.out.println(solarEnergyDog.getClass().getSimpleName());

    }
}
