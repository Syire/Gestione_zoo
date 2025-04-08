import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal>  {

    private ArrayList<T> l;

    public Zoo() {

        l = new ArrayList<>();
    }

    void addAnimal(T Animal) {

        l.add(Animal);

    }

    void removeAnimal(T Animal) {

        l.remove(Animal);
    }

    void listAnimals() {

        for (T animal : l) {

            System.out.println(animal);
            if(animal instanceof Feedable) {

                System.out.println(((Feedable) animal).feed());
            }
        }
    }

    public List<T> getAnimals() {

        return l;
    }
}
