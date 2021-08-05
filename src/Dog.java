public class Dog implements EdibleFood{
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
}


