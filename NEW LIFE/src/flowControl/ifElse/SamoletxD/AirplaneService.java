package src.flowControl.ifElse.SamoletxD;

public class AirplaneService {
    public int refuelAirplane(Airplane plane) {
        int finalPrice = 1;
        int max = 100;
        if (plane.fuel < 100 && plane.fuel >= 0) {
            max -= plane.fuel;
            finalPrice = max * 56;
            System.out.println("Заправка на " + max + " литров стоит " + finalPrice + " рублей.");
        } else if (plane.fuel < 0) {
            System.out.println("Значение неверное");
        } else {
            System.out.println("ПЕРЕЛИВ");
        }
        plane.fuel = 100;
        return finalPrice;
    }

    public String trashOrNot(Airplane air, int currentAge) {
        int raznica = currentAge - air.year;
        if (raznica > 30) {
            System.out.println("Самолету пора в утиль");
            return "Самолету пора в утиль";
        } else {
            System.out.println("Самолет еще полетает");
            return "Самолет еще полетает";
        }
    }
}
