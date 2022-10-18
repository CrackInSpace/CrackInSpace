package vehicle;

        import air.AIR;
        import air.Airplane;
        import air.Helicopter;

public class Vehicle_main {
    public Vehicle_main() {
    }

    public static void main(String[] arg) {
        AIR boing = new Airplane("Боинг");
        String var10001 = ((Airplane)boing).name;
        System.out.println("Модель самолета: " + var10001 + ". \nКоличество пассажирских мест: " + boing.passengerPlaces() + ". \nТопливный бак расчитан на " + boing.fuel() + " литров. \nМаксимальная высота: " + boing.maxHight() + " км. \nМаксимальное расстание полёта: " + boing.maxDistance() + " км. \nСтатус: " + boing.flight());
        AIR mig = new Airplane("Миг");
        ((Airplane)mig).setPassengerPlaces(2);
        ((Airplane)mig).setFuel(2700.0);
        ((Airplane)mig).setMaxHight(15);
        ((Airplane)mig).setMaxDistance(2500.0);
        ((Airplane)mig).setFlight("Military");
        var10001 = ((Airplane)mig).name;
        System.out.println("\nМодель самолета: " + var10001 + ". \nКоличество пассажирских мест: " + mig.passengerPlaces() + ". \nТопливный бак расчитан на " + mig.fuel() + " литров. \nМаксимальная высота: " + mig.maxHight() + " км. \nМаксимальное расстание полёта: " + mig.maxDistance() + " км. \nСтатус: " + mig.flight());
        AIR mi = new Helicopter("Ми");
        var10001 = ((Helicopter)mi).name;
        System.out.println("\nМодель вертолета: " + var10001 + ". \nКоличество пассажирских мест: " + mi.passengerPlaces() + ". \nТопливный бак расчитан на " + mi.fuel() + " литров. \nМаксимальная высота: " + mi.maxHight() + " км. \nМаксимальное расстание полёта: " + mi.maxDistance() + " км. \nСтатус: " + mi.flight());
        AIR shark = new Helicopter("Акула");
        ((Helicopter)shark).setPassengerPlaces(2);
        ((Helicopter)shark).setFuel(2400.0);
        ((Helicopter)shark).setMaxHight(12);
        ((Helicopter)shark).setMaxDistance(2200.0);
        ((Helicopter)shark).setFlight("Military");
        var10001 = ((Helicopter)shark).name;
        System.out.println("\nМодель вертолета: " + var10001 + ". \nКоличество пассажирских мест: " + shark.passengerPlaces() + ". \nТопливный бак расчитан на " + shark.fuel() + " литров. \nМаксимальная высота: " + shark.maxHight() + " км. \nМаксимальное расстание полёта: " + shark.maxDistance() + " км. \nСтатус: " + shark.flight());
    }
}

