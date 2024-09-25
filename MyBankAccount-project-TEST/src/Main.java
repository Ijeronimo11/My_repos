import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoneyTracker moneyTracker = new MoneyTracker(scanner);
        while (true) {
            MenuService.printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                moneyTracker.addNewNumberMoneyPerDay();
            } else if (i == 2) {
                moneyTracker.changeGoalByMoneyMonth();
            } else if (i == 3) {
                System.out.println("ТРОЙКА");
            } else if (i == 4) {
                System.out.println("ПОКЕДОВА");
                scanner.close();
                return;
            } else {
                System.out.println("ТАКОЙ КОМАНДЫ НЕТ.");
            }
        }
    }
}
