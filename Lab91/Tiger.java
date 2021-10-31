package Lab91;

//tốc độ (S) phụ thuộc vào cân nặng (W) theo tỉ lệ 0.06, cân nặng trung bình của 1 con tiger dao động từ 250 - 400 kg

public class Tiger extends Animals {

    private static final int MIN_WEIGHT = 250;
    private static final int MAX_WEIGHT = 400;
    private final double weight;

    public Tiger() {
        weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT - MIN_WEIGHT));
    }

    @Override
    protected double speed() {
        return weight * 0.06;
    }

    @Override
    public double getSpeed() {
        return speed();
    }

    @Override
    protected String simpleName() {
        return "Tiger";
    }
}
