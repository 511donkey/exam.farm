package exam.farm;

public class Chicken extends PetAnimals implements GiveResource, BeEaten {
    public Chicken(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void beEaten() {
        System.out.println("курицу съели");
    }

    @Override
    public void giveResource() {
        System.out.println("Курица дает яйца");
    }
}
