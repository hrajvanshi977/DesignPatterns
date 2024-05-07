package WithStrategyPattern.Strategy;

public class SpecialDriveCapability implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
