package Lab91;
//Tốc độ của ngựa dao động từ 15-24m/s.

public class Horse extends Animals{
    private static final double MIN_SPEED = 2.0;
    private static final double MAX_SPEED = 5.0;

    private final double actualSpeed;

    public Horse() {
        actualSpeed = MIN_SPEED + (Math.random() * (MAX_SPEED - MIN_SPEED));
    }

    @Override
    protected double speed() {
        return actualSpeed;
    }

    @Override
    public double getSpeed() {
        return speed();
    }

    @Override
    protected String simpleName() {
        return "Horse";
    }
}
