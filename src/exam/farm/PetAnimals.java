package exam.farm;

public class PetAnimals {

    String name;
    protected int weight;
    protected int speed;
    protected int health;
    protected int resource;
    protected boolean isOnFarm = true;


    public PetAnimals(String name, int weight, int speed, int health, int resource) {
        setName(name);
        setWeight(weight);
        setSpeed(speed);
        setHealth(health);
        setResource(resource);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health > 0 ) this.health = health;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        if(resource >= 0) this.resource = resource;
    }



    public void healthUp(PetAnimals petAnimal){
        health += 1;
    };

    public void eat(PetAnimals petAnimal){
        health = (int) ((Math.random() * 7) +1 );
    }

    public void eaten(){
        isOnFarm = false;
    }

    public void go(){};

}
