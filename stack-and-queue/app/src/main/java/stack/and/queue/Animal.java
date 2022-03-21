package stack.and.queue;

public class Animal {
    private Boolean animal ;
    private String animalName;

    public Animal() {

    }
    public Animal(String animalName) {
        if(animalName=="cat"||animalName=="dog")
        this.animalName=animalName;

    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return (String) animalName ;
    }
}
