package earth;

import vehicle.Vehicle_main;

public class Car extends Vehicle_main implements EARTH {
    private int speed;
    private int fuel;
    private int passengerPlaces;
    private String name;
    private String color;

    public Car(int speed, int fuel, int passengerPlaces, String name, String color){
        this.speed = speed;
        this.fuel = fuel;
        this.passengerPlaces = passengerPlaces;
        this.name = name;
        this.color = color;
    }

    @Override
    public double distance() {
        int S = speed * 24;
        return S;
    }
    public String toString(){
        return "Марка машины: " + name + ".\nДостигает скорости до: " + speed + " км\\ч.\nВмещает до: " + passengerPlaces + " людей.\n" +
                "Цвет машины: " + color + ".";
    }
}