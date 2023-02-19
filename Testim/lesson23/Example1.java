package lesson23;

public class Example1 {
    public static void main(String[] args) {
        resolve(Weather.RAINY);
        resolve(Weather.SNOWY);
        resolve(Weather.SUNNY);

        resolveWithSwitch(Weather.RAINY);
        resolveWithSwitch(Weather.SNOWY);
        resolveWithSwitch(Weather.SUNNY);
        System.out.println();

        resolve(Role.ADMIN);
        resolve(Role.USER);
    }

    private static void resolve(Role role){
        System.out.println(role.getValue());
    }

    private static void resolve(Weather weather){
        System.out.println(weather == Weather.RAINY?
                "Rainy" : weather == Weather.SNOWY?
                "Snowy" : "");
    }


    private static void resolveWithSwitch(Weather weather){
        switch (weather){
            case RAINY:
                System.out.println("Rainy");
                break;
            case SNOWY:
                System.out.println("Snowy");
                break;
            case SUNNY:
                System.out.println("Sunny");
                break;
        }
    }
}
