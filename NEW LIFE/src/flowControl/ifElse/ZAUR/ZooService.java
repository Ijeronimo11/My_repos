package src.flowControl.ifElse.ZAUR;

public class ZooService {
    public static void startLife(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.eat();
    }
    public static Animal createAnimalByType(AnimalType type) {
        switch (type) {
            case TIGER:
                return new Tiger();
            case OWL:
                return new Owl();
            default:
                return null;
        }
    }
}

// Возможность писать гибкие участки кода интерфейса на основании родительского типа, подразумевая, что
// туда в рантайме может придти ЛЮБОЙ наследник.
// Используется там, где мы не знаем что придет. Или надо сделать метод, которому похуй какой наследник придет.
