public class Elephant extends Animal implements Feedable{

    public Elephant(String name, int age) throws InvalidAgeException {

        super(name, age);
    }

    @Override
    public String feed() {

        return name+",il nostro elefante, mangia qualsiasi cosa(menomale)";
    }

    @Override
    public double calculateDailyFoodRequirement() {

        return age*50.0;
    }
}
