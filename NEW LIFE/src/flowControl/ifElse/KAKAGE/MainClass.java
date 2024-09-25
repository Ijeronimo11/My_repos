package src.flowControl.ifElse.KAKAGE;

public class MainClass {
    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal animal1 = new Animal("SKY", "AFRIKA");
        Animal horse = new Horse("OVES", "POLE", "SIVKA-BURKA");
        Animal dog = new Dog("M9SO", "KVARTIRA/ULICA", "BOBIK");
        Animal cat = new Cat("KORM", "KVARTIRA", "SILVA <3");
        animal1.eat();
        animal1.makeNoise();
        horse.eat();
        horse.makeNoise();
        dog.eat();
        dog.makeNoise();
        cat.eat();
        cat.makeNoise();
        // 6 пункт с массивом и ветеринаром.
        Animal[]animal = new Animal[4];
        animal[0] = animal1;
        animal[1] = horse;
        animal[2] = dog;
        animal[3] = cat;
        for (Animal animals : animal) {
            vet.treatAnimal(animals);
        }
    }
}
