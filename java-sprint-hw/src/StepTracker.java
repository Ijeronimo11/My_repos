import java.util.Scanner;

public class StepTracker {
    // ТУТ ВСЯ ЛОГИКА ПО СОХРАНЕНИЮ И ИЗМЕНЕНИЮ КОЛ-ВА ШАГОВ. + СТАТИСТИКА.
    Scanner scanner;
    int goalByStepsPerDay = 10000;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    public StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumberScan = scanner.nextInt();
        if (monthNumberScan < 1 || monthNumberScan > 12) {
            System.out.println("Введите корректное число.");
            return;
        }
        System.out.println("Введите день от 1 до 30");
        int dayNumberScan = scanner.nextInt();
        if (dayNumberScan < 1 || dayNumberScan > 31) {
            System.out.println("Введите корректное число");
            return;
        }
        System.out.println("Введите количество шагов");
        int stepsCountScan = scanner.nextInt();
        if (stepsCountScan < 0) {
            System.out.println("Введите правильное число шагов");
            return;
        }
        MonthData monthData = monthToData[monthNumberScan - 1];
        monthData.days[dayNumberScan - 1] = stepsCountScan;
    }
    public void changeStepGoal() {
        int newStepsGoalScan = scanner.nextInt();
        if (newStepsGoalScan <= 0) {
            System.out.println("Введите корректное число шагов.");
        } else {
            goalByStepsPerDay = newStepsGoalScan;
        }
    }

    public void printStatistic() {
        System.out.println("Введите номер месяца");
        int monthNumScan = scanner.nextInt();
        if (monthNumScan < 1 || monthNumScan > 12) {
            System.out.println("Введите корректное число.");
            return;
        }
        MonthData monthData = monthToData[monthNumScan - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println();
        System.out.println("-----");
        System.out.println("Всего шагов за месяц: " + sumSteps + ".");
        System.out.println("-----");
        int maxStepsMonth = monthData.maxSteps();
        System.out.println("Максимальное пройденное количество шагов за месяц: " + maxStepsMonth);
        System.out.println("-----");
        int middleStepsCount = sumSteps / 30;
        System.out.println("Среднее пройденных шагов за месяц: " + middleStepsCount);
        System.out.println("-----");
        int distanceKm = converter.convertToKm(sumSteps);
        System.out.println("Прошли км за месяц " + distanceKm);
        System.out.println("-----");
        int fireCalories = converter.convertStepsToKilocalories(sumSteps);
        System.out.println("К.калорий было сожжено: " + fireCalories);
        System.out.println("-----");
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);
        System.out.println("Лучшая серия: " + bestSeries);
        System.out.println("--------------------------THE END.--------------------------");
        System.out.println();
    }
}
