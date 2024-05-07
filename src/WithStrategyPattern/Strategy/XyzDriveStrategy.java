package WithStrategyPattern.Strategy;

public class XyzDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ drive capability");
    }
}
