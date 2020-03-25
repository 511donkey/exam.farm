package exam.farm;

public class Farmer {
    protected String name;
    protected int resource = 5;


    public Farmer(String name, int resource) {
        setName(name);
        setResource(resource);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name != null) this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        if(resource > 0) this.resource = resource;
    }


    public void eat(BeEaten petAnimal){
    };

    public void drive(WildAnimals wildAnimal){
        wildAnimal.counter ++;
    }

    public void feed (PetAnimals petAnimal){
        petAnimal.health ++;
        petAnimal.weight ++;
    }

    public void takeResource(PetAnimals[] petAnimals){
        for (int i = 0; i < petAnimals.length; i++) {
            if(petAnimals[i].isOnFarm = true){
                for (int j = 0; j < petAnimals.length ; j++) {
                    if(petAnimals[i] instanceof GiveResource) {
                        resource += petAnimals[i].resource;
                    }
                }
            }
        }
    }
}
