package Lab8;

import java.security.SecureRandom;

public class Eagle extends Animal{
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(200);
    }

    @Override
    protected boolean flyable() {
        return true;
    }

    @Override
    public int getSpeed() {
        return speed();
    }
}
