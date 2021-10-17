package Lession06Abstract;

public class RobotDog {
    private String name;
    protected static String defaultName;
    protected static int totalNavNum;

    public RobotDog() {
    }

    public RobotDog(String name) {
        this.name = name;
    }


    //Class method  | Before the instance created
    public static String getDefaultName(){
        if(defaultName ==null){
            return "Dog";
        }
        return "Robot Dog Default name" + defaultName;
    }



}
