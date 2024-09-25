import java.util.Scanner;

public class MoneyTracker {
    Scanner scanner; // НЕ УВЕРЕН, ЧТО НЕ В MonthData.

    MonthData[] monthToData = new MonthData[12];
    public MoneyTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    public void addNewNumberMoneyPerDay() {
        System.out.println("ВВЕДИТЕ НОМЕР МЕСЯЦА");
        int monthNumberScan = scanner.nextInt();
        if (monthNumberScan < 1 || monthNumberScan > 12) {
            System.out.println("ВВЕДИТЕ КОРРЕКТНОЕ ЧИСЛО");
            return;
        }
        System.out.println("ВВЕДИТЕ ДЕНЬ ОТ 1 ДО 30");
        int dayNumberScan = scanner.nextInt();
        if (dayNumberScan < 1 || dayNumberScan > 30) {
            System.out.println("ВВЕДИТЕ КОРРЕКТНОЕ ЧИСЛО");
            return;
        }
        System.out.println("ВВЕДИТЕ СУММУ, ОТЛОЖЕННУЮ ЗА ДЕНЬ");
        int moneyCountDay = scanner.nextInt();
        if (moneyCountDay < 0) {
            System.out.println("ВВЕДИТЕ КОРРЕКТНУЮ СУММУ");
            return;
        }

        MonthData monthData = monthToData[monthNumberScan - 1];
        monthData.days[dayNumberScan - 1] = moneyCountDay;
    }

    // МЕТОД МЕНЯЮЩИЙ ГОЛ ЗА МЕСЯЦ

}
