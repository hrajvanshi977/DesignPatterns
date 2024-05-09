package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.SpecialDriveCapability;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDriveCapability());
    }
}
