package Lab8;

import java.security.SecureRandom;

public class Tiger extends Animal {
    @Override
    protected int speed() {
        return new SecureRandom().nextInt(150);
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
