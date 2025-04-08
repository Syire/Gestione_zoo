public class Lion extends Animal implements Feedable{

    public Lion(String name, int age) throws InvalidAgeException {

        super(name, age);
    }

    @Override
    public String feed() {

        return name + ",il nostro leone, va nutrito con carne fresca e di qualità(leone raffinato)";
    }

    @Override
    public double calculateDailyFoodRequirement() {

        return age*5.0;
    }
}
