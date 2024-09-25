package src.flowControl.ifElse.ZAUR;

public class MainClass {
    public static void main(String[] args) {
        AnimalType animalType1 = AnimalType.OWL;
        AnimalType animalType2 = AnimalType.TIGER;

        Animal animal = ZooService.createAnimalByType(AnimalType.OWL);

        int code = animalType1.getCode();
        System.out.println(code);
    }
}
