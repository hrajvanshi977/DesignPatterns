package StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle sportVehicle = new SportVehicle();
        sportVehicle.drive();

    }
}
