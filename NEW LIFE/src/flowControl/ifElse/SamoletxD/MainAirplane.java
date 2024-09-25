package src.flowControl.ifElse.SamoletxD;

public class MainAirplane {
    public static void main(String[] args) {
        AirplaneService airplaneService = new AirplaneService();
        Airplane newAir1 = new Airplane("BOING", 2020, 434.2, 41, 12);
        Airplane newAir2 = new Airplane("AIRBUS", 1990, 532.1, 66,86);
        Airplane newAir3 = new Airplane("EMBRAER", 1993, 548.9, 39,64);
        Airplane newAir4 = new Airplane("BOMBARDIER", 1989, 495.4, 54,94);
        Airplane newAir5 = new Airplane("FLYING", 1840, 295.4, 44,33);

    // Вызов трех методов: Информация о самолете newAir1, дозаправка, проверка на вес.
        newAir1.info();
        airplaneService.refuelAirplane(newAir1);
        airplaneService.trashOrNot(newAir1, 2024);

    //Пошел метод, принимающий массив и выводящий кол-во самолетов > 50тонн
        AirplaneFactory airplaneFactory = new AirplaneFactory();
        Airplane[]airs = new Airplane[5];
        airs[0] = newAir1;
        airs[1] = newAir2;
        airs[2] = newAir3;
        airs[3] = newAir4;
        airs[4] = newAir5;
        int airsCount = airplaneFactory.weightCount(airs);
        System.out.println();
        System.out.println("Количество самолетов весом более 50 тонн: " + airsCount +".");
    }
}
