package exam.farm;

public class Farm {
    Farmer farmer = new Farmer("Фермер", 5);
    PetAnimals[] petAnimals = new PetAnimals[10];
    WildAnimals[] wildAnimals = new WildAnimals[7];


    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public PetAnimals[] getPetAnimals() {
        return petAnimals;
    }

    public void setPetAnimals(PetAnimals[] petAnimals) {
        this.petAnimals = petAnimals;
    }

    public void addAnimal(PetAnimals newPetAnimal){
        for (int i = 0; i < petAnimals.length; i++) {
            if(petAnimals[i] == null){
                petAnimals[i] = newPetAnimal;
                break;
            }
        }
    }

    public void addWildAnimal(WildAnimals newPeWildAnimal){
        for (int i = 0; i < wildAnimals.length; i++) {
            if(wildAnimals[i] == null){
                wildAnimals[i] = newPeWildAnimal;
                break;
            }
        }
    }

    public void passDay(WildAnimals[] wildAnimals){
        farmer.resource -=2;
       // for (int i = 0; i < wildAnimals.length; i++) {
          //  wildAnimals[(int) (Math.random() * 2)].eat(petAnimals[(int) (Math.random() * 3 + 1)]);
          //  if (petAnimals[i].isOnFarm) wildAnimals[i].counter++;
        //}
        for (int i = 0; i < petAnimals.length; i++) {
            farmer.feed(petAnimals[i]);
        }
        for (int i = 0; i < petAnimals.length; i++) {
            farmer.takeResource(petAnimals);
        }
    }
}
