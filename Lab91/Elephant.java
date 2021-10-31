package Lab91;
//Elephant: Tốc độ (S) tỉ lệ thuận với chiều dài sải chân (T) theo tỉ lệ 6.0, sải chân của 1 con voi dao động từ 3-4m

public class Elephant extends Animals{

    private static final double MIN_SPEED = 3.0;
    private static final double MAX_SPEED = 4.0;

    private final double steps;

    public Elephant() {
        steps = MIN_SPEED + (Math.random() * (MAX_SPEED - MIN_SPEED));
    }


    @Override
    protected double speed() {
        return steps * 6;
    }

    @Override
    public double getSpeed() {
        return speed();
    }

    @Override
    protected String simpleName() {
        return "Elephant";
    }
}
