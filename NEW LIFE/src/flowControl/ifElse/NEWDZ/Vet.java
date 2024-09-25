package src.flowControl.ifElse.NEWDZ;

public class Vet {
    public static void treatAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(((Dog) animal).name + " жрет: " + dog.food + ". Проживает на: " + ((Dog) animal).location);
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(((Cat) animal).name + " жрет: " + cat.food + ". Проживает на: " + ((Cat) animal).location);
        } else if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println(((Horse) animal).name + " жрет: " + horse.food + ". Проживает на: " + ((Horse) animal).location);
        }
    }
}
