package exam.farm;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        WildAnimals[] wildAnimals = new WildAnimals[7];
        Cow cow = new Cow("Буренка", 100, 10, 40, 15);
        Chicken chicken = new Chicken("курица", 2, 30, 30,6);
        Cat cat = new Cat("Кот", 5, 20, 50, 0);
        Farmer farmer = new Farmer("Фермер", 20);
        Fox fox = new Fox("Лиса", 40, 40, 50);
        Wolf wolf = new Wolf("волк", 15, 50,20);

        farm.addAnimal(cow);
        farm.addAnimal(cat);
        farm.addAnimal(cow);
        farm.addAnimal(cow);
        farm.addAnimal(cat);
        farm.addAnimal(cow);
        farm.addAnimal(chicken);
        farm.addAnimal(chicken);
        farm.addAnimal(cat);
        farm.addAnimal(chicken);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(wolf);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(wolf);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(wolf);

        farm.passDay(wildAnimals);

    }
}
