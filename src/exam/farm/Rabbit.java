package exam.farm;

public class Rabbit extends PetAnimals implements BeEaten {
    public Rabbit(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void beEaten() {
        System.out.println("Кролика съели");
    }
}
