package Lab8;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(100);
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
