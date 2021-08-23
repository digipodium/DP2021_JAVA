package collections_n_generics;

/**
 * this is a class to create a dog object related to reallife dogs
 * */
public class Dog implements EdibleFood {
    private String breed;
    private String color;
    private String dogType;
    private int age;

    public Dog(String breed, String color, String dogType, int age) {
        this.breed = breed;
        this.color = color;
        this.dogType = dogType;
        this.age = age;
    }

    public void bark(){
        System.out.println("Bow wow");
    }
    /**
     * this is an overloaded function for the dog
     * */
    public void bark(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("bow wow!");
        }
    }

    @Override
    public void setFoodList() {

    }

    @Override
    public void selectFood(String food) {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", dogType='" + dogType + '\'' +
                ", age=" + age +
                '}';
    }
}


