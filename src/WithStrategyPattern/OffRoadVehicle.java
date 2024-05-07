package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SpecialDriveCapability;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDriveCapability());
    }
}
