package src.flowControl.ifElse.TestTestxD;
import java.util.Random;

public class Randomizer {
    public Characterr CreateNewSoldier() {
        Random random = new Random();
        Characterr characterr = new Characterr();
        String[]names = {"JOHN", "TONY", "MICHAEL", "LAMAR", "TREVOR"};
        String[]weapons = {"SCAR", "Glock-17", "M16", "AK-74", "Desert Eagle"};
        double[]dmgs = {0.531, 1.688, 2.951, 3.694, 4.769};

        characterr.name = names[random.nextInt(names.length)];
        characterr.weapon = weapons[random.nextInt(weapons.length)];
        characterr.dmg = dmgs[random.nextInt(dmgs.length)];

        characterr.showInfo();
        return characterr;
    }
}
