package src.flowControl.ifElse.KAKAGE;

public class Veterinar {
    int numberOfAnimal = 1;
    public void treatAnimal(Animal animal) {
        System.out.println("Животное номер " + numberOfAnimal + " пришло к ветеринару. Оно кушает: " + animal.food + ". Обитает: " + animal.location + ".");
        numberOfAnimal ++;
    }
}
