package stack.and.queue;

public class AnimalShelter<T> {
    private Queue <Animal> animalQueue = new Queue<>();

    public AnimalShelter() {

    }

    public Queue<Animal> getAnimalQueue() {
        return animalQueue;
    }

    public void setAnimalQueue(Queue<Animal> animalQueue) {
        this.animalQueue = animalQueue;
    }

    void enqueue (Animal animal){
        if(animal.getAnimalName().toString()=="cat"|| animal.getAnimalName().toString()=="dog")
        animalQueue.enqueue(animal);
    }

    Animal dequeue (String pref){
        Animal foundAnimal=new Animal("no such animal found");
        if((pref!="cat"&&pref!="dog")||animalQueue.front==null){
            return null ;
        }

        try{
            Node<Animal> currentPrevious = null;
            Node<Animal> current = animalQueue.front;

            while (current != null) {
//                System.out.println("current->"+current.value.toString());
                if (current.value.toString() == pref) {
                    foundAnimal = current.value;
                    if (currentPrevious != null) {
                        currentPrevious.next = current.next;
                        current = current.next;
                    } else {
                        animalQueue.front=current.next;
                    }
                    break;
                }
                currentPrevious=current;
                current=current.next;

            }
        } catch (NullPointerException err){
            System.out.println("dequeue error "+err.getMessage());
        }

        return foundAnimal;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animalQueue=" + animalQueue +
                '}';
    }
}
