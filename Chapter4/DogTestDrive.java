class DogTestDrive{
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.setSize(70);
        Dog dogTwo = new Dog();
        dogTwo.setSize(8);

        System.out.println("Dog one: "+dogOne.getSize());
        System.out.println("Dog two: "+dogTwo.getSize());

        dogOne.bark();
        dogTwo.bark();
    }
}