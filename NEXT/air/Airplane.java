package air;

import vehicle.Vehicle_main;

public class Airplane extends Vehicle_main implements AIR {
    public String name;
    private int passengerPlaces = 46;
    private double fuel = 4900.0;
    private int maxHight = 17;
    private double maxDistance = 4700.0;
    private String flight;

    {//инициализатор конструктора
        this.flight = "Civilian";
    }

    public Airplane(String name) {
        this.name = name;
    }

    public void setPassengerPlaces(int set) {
        this.passengerPlaces = set;
    }

    public int getPassengerPlaces() {
        return this.passengerPlaces;
    }

    public void setFuel(double set) {
        this.fuel = set;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setMaxHight(int set) {
        this.maxHight = set;
    }

    public int getMaxHight() {
        return this.maxHight;
    }

    public void setMaxDistance(double set) {
        this.maxDistance = set;
    }

    public double getMaxDistance() {
        return this.maxDistance;
    }

    public void setFlight(String set) {
        this.flight = set;
    }

    public String getFlight() {
        return this.flight;
    }

    public int passengerPlaces() {
        return this.getPassengerPlaces();
    }

    public double fuel() {
        return this.getFuel();
    }

    public int maxHight() {
        return this.getMaxHight();
    }

    public double maxDistance() {
        return this.getMaxDistance();
    }

    public String flight() {
        return this.getFlight();
    }
}
