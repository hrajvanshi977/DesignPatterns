package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.SpecialDriveCapability;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDriveCapability());
    }
}
