package water;

import vehicle.Vehicle_main;

public class Boat extends Vehicle_main implements WATER {
    private int speed;
    private int fuel;
    private int passengerPlaces;
    private String name;
    private String color;
    private String target;

    {
        target = new String("Military");
    }
    public Boat(int speed, int fuel, int passengerPlaces, String name, String color){
        this.speed = speed;
        this.fuel = fuel;
        this.passengerPlaces = passengerPlaces;
        this.name = name;
        this.color = color;
    }

    public String who(){
        return passengerPlaces >= 5 && speed >= 60? "Лодка для отдыха." : passengerPlaces >=5 & target.equals("Military")? "Лодка для операций." : "Лодка для путишествий.";
    }
    @Override
    public void goal() {
        if(speed >= 60) System.out.println("Civilian\n");
        else System.out.println(target + "\n");
    }
    public String toString(){
        return "Название лодки: " + name + ".\nЦвет лодки: " + color + ".\nКоличество мест: " + passengerPlaces
                + ".\nПредназначение - " + who() + "\nМатерьял лодки: " + materialBOAT + ".\nТип лодки: ";
    }
}