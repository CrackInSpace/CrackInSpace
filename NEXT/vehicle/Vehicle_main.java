package vehicle;

        import air.AIR;
        import air.Airplane;
        import air.Helicopter;
        import earth.Bus;
        import earth.Car;
        import earth.EARTH;
        import earth.Truck;
        import water.Boat;
        import water.Ship;
        import water.Submarine;
        import water.WATER;

        import java.util.ArrayList;
        import java.util.HashMap;

public class Vehicle_main {
    public String materialBOAT = new String("Резина");

    public static void main(String[] arg) {
        AIR boing = new Airplane("Боинг");
        System.out.println("Модель самолета: " + ((Airplane)boing).name + ". \nКоличество пассажирских мест: " + boing.passengerPlaces() + ". \nТопливный бак расчитан на " + boing.fuel() + " литров. \nМаксимальная высота: " + boing.maxHight() + " км. \nМаксимальное расстание полёта: " + boing.maxDistance() + " км. \nСтатус: " + boing.flight());
        AIR mig = new Airplane("Миг");
        ((Airplane)mig).setPassengerPlaces(2);
        ((Airplane)mig).setFuel(2700.0);
        ((Airplane)mig).setMaxHight(15);
        ((Airplane)mig).setMaxDistance(2500.0);
        ((Airplane)mig).setFlight("Military");
        System.out.println("\nМодель самолета: " + ((Airplane)mig).name + ". \nКоличество пассажирских мест: " + mig.passengerPlaces() + ". \nТопливный бак расчитан на " + mig.fuel() + " литров. \nМаксимальная высота: " + mig.maxHight() + " км. \nМаксимальное расстание полёта: " + mig.maxDistance() + " км. \nСтатус: " + mig.flight());
        AIR mi = new Helicopter("Ми");
        System.out.println("\nМодель вертолета: " + ((Helicopter)mi).name + ". \nКоличество пассажирских мест: " + mi.passengerPlaces() + ". \nТопливный бак расчитан на " + mi.fuel() + " литров. \nМаксимальная высота: " + mi.maxHight() + " км. \nМаксимальное расстание полёта: " + mi.maxDistance() + " км. \nСтатус: " + mi.flight());
        AIR shark = new Helicopter("Акула");
        ((Helicopter)shark).setPassengerPlaces(2);
        ((Helicopter)shark).setFuel(2400.0);
        ((Helicopter)shark).setMaxHight(12);
        ((Helicopter)shark).setMaxDistance(2200.0);
        ((Helicopter)shark).setFlight("Military");
        System.out.println("\nМодель вертолета: " + ((Helicopter)shark).name + ". \nКоличество пассажирских мест: " + shark.passengerPlaces() + ". \nТопливный бак расчитан на " + shark.fuel() + " литров. \nМаксимальная высота: " + shark.maxHight() + " км. \nМаксимальное расстание полёта: " + shark.maxDistance() + " км. \nСтатус: " + shark.flight());
        EARTH maz = new Bus(80, 70, 24, "Scool Actavia", "Желтый");
        HashMap<String, ArrayList<String>> model = new HashMap<>();
        model.put("BUS", new ArrayList<String>());
        for(String a : ((Bus) maz).array){//Добавляем массив в ArrayList
            model.get("BUS").add(a);
        }
        System.out.println("\n" + maz  + "\nДистанция которую сможет преодолеть за 24 часа: " + maz.distance() + " км\\ч.");
        //Аналогично можно добавить про автобусы
        System.out.println("\nВсе марки автобусов: " + String.join(" ", model.get("BUS")));
        EARTH skoda = new Car(160, 60, 5, "Rapid", "Синий");
        System.out.println("\n" + skoda  + "\nДистанция которую сможет преодолеть за 24 часа: " + skoda.distance() + " км\\ч.");
        //Анологично можно еще добавить что нибудь прикольное
        EARTH copter = new Truck(60, 200, 4, "Wild MEN", "BLACK");
        System.out.println("\n" + copter  + "\nДистанция которую сможет преодолеть за 24 часа: " + copter.distance() + " км\\ч.\n");
        WATER jet = new Boat(110, 50, 4, "Jet", "Голубой");
        System.out.print(jet);
        jet.goal();
        WATER miter = new Boat(57, 160, 14, "Milter", "Black");
        System.out.print(miter);
        miter.goal();
        WATER milka = new Ship(45, 700, 200, "Kotlin", "Grey");
        System.out.printf("Название флота: %s.\nСкорость передвижение: %s км\\ч.\nКоличество людей: %s.\nКоличество топлива: %s литров.\nЦвет: %s.",
                ((Ship) milka).getName(), ((Ship) milka).getSpeed(), ((Ship) milka).getPassengerPlaces(), ((Ship) milka).getFuel(), ((Ship) milka).getColor());
        System.out.println("\n" + ((Ship) milka).gun());
        WATER batisk = new Submarine(100, 400, 60, "Subik", "Black");
        System.out.printf("Название флота: %s.\nСкорость передвижение: %s км\\ч.\nКоличество людей: %s.\nКоличество топлива: %s литров.\nЦвет: %s.",
                ((Submarine) batisk).getName(), ((Submarine) batisk).getSpeed(), ((Submarine) batisk).getPassengerPlaces(), ((Submarine) batisk).getFuel(), ((Submarine) batisk).getColor());
        System.out.println("\n" + ((Submarine) batisk).gun());
    }
}
