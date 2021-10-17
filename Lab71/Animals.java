package Lab71;


import java.security.SecureRandom;

public class Animals {

    private  final int speed;
    private  final boolean flyAble;
    private final String name;

    private Animals(Builder builder) {
        this.speed = builder.speed;
        this.flyAble = builder.flyAble;
        this.name = builder.name;
       }

    public boolean getFlyAbleStatus(){
        return this.flyAble;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName(){
        return name;
    }

    public static class Builder {
        public String name;
        private int speed;
        private boolean flyAble;

        Builder(){}

        public Builder speed(int maxSpeed){
            this.speed = new SecureRandom().nextInt(maxSpeed);;
            return this;
        }

        public Builder flyAble(boolean flyAble){
            this.flyAble = flyAble;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Animals build(){
            return new Animals(this);
        }
    }


}
