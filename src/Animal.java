public abstract class Animal{

    String name;
    int age;

    public Animal(String name, int age) throws InvalidAgeException{

        if(age < 0 ) {

            throw new InvalidAgeException();
        }

        this.name = name;
        this.age = age;
    }

    public abstract double calculateDailyFoodRequirement();

    @Override
    public String toString() {

        return getClass().getName() + " [Name=" + name + ", age=" + age + ", KG="+calculateDailyFoodRequirement() + "]";
    }
}
