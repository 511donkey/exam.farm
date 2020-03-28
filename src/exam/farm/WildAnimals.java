package exam.farm;

public class WildAnimals {
    protected String name;
    protected int weight;
    protected int speed;
    protected int strength;
    protected int counter = 0;
    protected boolean goOnFarm = true;


    public WildAnimals(String name, int weight, int speed, int strength) {
        setName(name);
        setWeight(weight);
        setSpeed(speed);
        setStrength(strength);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength > 0) this.strength = strength;
    }



    public void eat (PetAnimals petAnimal) {
        if(petAnimal.getSpeed() < speed) {
            petAnimal.eaten();
        } else {petAnimal.go();}
    }

    public void go(){
        if (counter > 3){
            goOnFarm = false;
        }
    }

}
