package src.flowControl.ifElse.VOIN;
import java.util.Random;

public class VoinFightMethod {
    public void StartTheBattle(Voin first, Voin two) {
        Random random = new Random();
        while (first.hp > 0 || two.hp > 0) {
            int randomIndex = random.nextInt(101);
            if (randomIndex < 50) {
                two.hp -= 20;
                System.out.println("Второй боец теряет 20хп. У него осталось: " + two.hp + " hp.");
            } else if (randomIndex > 50) {
                first.hp -= 20;
                System.out.println("Первый боец теряет 20хп. У него осталось: " + first.hp + " hp.");
            }
            if (first.hp == 0) {
                System.out.println("Победил второй боец. Его хп: " + two.hp);
                break;
            } else if (two.hp == 0) {
                System.out.println("Победил первый боец. Его хп: " + first.hp);
                break;
            }
        }
    }
}
