package GreedyAlgorithms;

public class GreedyAlgorithms2 {
    public static void main(String[] args) {
        int[] stations = new int[]{0, 200, 375, 550, 750, 950};
        System.out.println("Minimum number of times to refuel: " + minStops(stations, 400));
        System.out.println("Minimum number of times to refuel: " + minStops2(stations, 400));
    }

    private static int minStops2(int[] stations, int fuelCapacity){//Мой способ
        int currentFuel = fuelCapacity;
        int nextFuel;
        int stops = 0;

        for (int i = 0; i < stations.length - 1; i++) {
            //System.out.println(stations[i + 1]); //Проверка станций
            nextFuel = stations[i + 1] - stations[i];
            if (currentFuel - nextFuel > 0) {
                currentFuel -= nextFuel;
            } else {
                stops++;
                currentFuel = fuelCapacity;
                i--;//Чтобы не перескакивать на следующую не отняв текущее
            }
        }
        return stops;
    }

    private static int minStops(int[] stations, int fuelCapacity){
        int result = 0;
        int currentStop = 0;

        while (currentStop < stations.length - 1){
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= fuelCapacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }
        return result;
    }
}
