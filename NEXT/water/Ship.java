package water;

import vehicle.Vehicle_main;

public class Ship extends Vehicle_main implements WATER {
    private int speed;
    private int fuel;
    private int passengerPlaces;
    private String name;
    private String color;
    private String target;

    {
        target = new String("Military");
    }
    public Ship(int speed, int fuel, int passengerPlaces, String name, String color){
        this.speed = speed;
        this.fuel = fuel;
        this.passengerPlaces = passengerPlaces;
        this.name = name;
        this.color = color;
    }

    public int getFuel() {
        return fuel;
    }

    public int getPassengerPlaces() {
        return passengerPlaces;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTarget() {
        return target;
    }

    public void mat(){
        System.out.println(materialBOAT);
    }

    @Override
    public void goal() {
        if(speed >= 60) System.out.println("Civilian\n");
        else System.out.println(target + "\n");
    }
    public String gun(){
        return target.equals("Military")? "Имеет вооружение.\n" : "Обычный корабль.\n";
    }
}