import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            MenuClass.printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("ВЫПОЛНЯЮ ЦИФРУ 1");
            } else if (i == 2) {
                System.out.println("Выберите какого друга вы хотите: ");
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
}
