public class Main {

    public static void main(String[] args) {

        Zoo<Animal> zoo = new Zoo<>();

        try {

            Lion leo= new Lion("Leo",4);
            Elephant elephant = new Elephant("Elephant",5);
            //Lion leo2 = new Lion("Leo2",-6);

            zoo.addAnimal(leo);
            zoo.addAnimal(elephant);
            //zoo.addAnimal(leo2)
            zoo.listAnimals();
            //zoo.removeAnimal(leo);
            //zoo.listAnimals();

            for (Animal animal : zoo.getAnimals()) {
                System.out.println(animal);
                if (animal instanceof Feedable) {
                    System.out.println(((Feedable) animal).feed());
                }
            }



        } catch (InvalidAgeException e) {

            System.out.println("Errore durante la lettura del animal:"+e);
        }
    }
}