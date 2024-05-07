package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SpecialDriveCapability;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDriveCapability());
    }
}
