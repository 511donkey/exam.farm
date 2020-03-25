package exam.farm;

public class Cow extends PetAnimals implements GiveResource, BeEaten {

    public Cow(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }


    @Override
    public void beEaten() {
        System.out.println("корова съедена");
    }

    @Override
    public void giveResource() {
        System.out.println("корова дает молоко");
    }
}
