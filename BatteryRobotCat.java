package Lession06Abstract;

public class BatteryRobotCat extends RobotCat {

    private String batteryType;

    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }
    public BatteryRobotCat(String name, String productionDate,String batteryType) {
        super(name, productionDate);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public void runWithBattery(){
        System.out.println("runWithBattery");

    }


    //annotation
    @Override
    public void charge() {
        super.charge();
        System.out.println("with solar battery Circuit");
    }
}
