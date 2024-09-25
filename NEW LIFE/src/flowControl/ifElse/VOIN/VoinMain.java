package src.flowControl.ifElse.VOIN;

public class VoinMain {
    public static void main(String[] args) {
        VoinFightMethod voinFightMethod = new VoinFightMethod();
        Voin firstVoin = new Voin(100);
        Voin secondVoin = new Voin(100);
        voinFightMethod.StartTheBattle(firstVoin, secondVoin);
    }
}
