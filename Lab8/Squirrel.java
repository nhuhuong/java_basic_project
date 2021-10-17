package Lab8;

import java.security.SecureRandom;

public class Squirrel extends Animal{
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(50);
    }

    @Override
    protected boolean flyable() {
        return false;
    }

    @Override
    public int getSpeed() {
        return speed();
    }
}
