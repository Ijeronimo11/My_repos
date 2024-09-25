package src.flowControl.ifElse.NEWDZ;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[]animals = new Animal[3];
        animals[0] = new Dog("СУХОЙ КОРМ", "Квартира и улица", "БОБИК", 5);
        animals[1] = new Cat("МОКРЫЙ КОРМ", "КВАРТИРА", "СИЛЬВА", 7);
        animals[2] = new Horse("SENO", "POLE", "Bo-Jack", 11);
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Животное номер " + (i + 1) + " уходит к ветеринару.");
        }
        Vet.treatAnimal(new Cat("СУХОЙ КОРМ", "Квартира и улица", "БОБИК", 5));
        Vet.treatAnimal(new Horse("СУХОЙ КОРМ", "Квdadadadи улица", "БОБИК", 3));
    }
}
