class Dog{
    String name;

    public void bark(){
        System.out.println(name + " barks Ruff!");
    }

    public void eat(){ }
    public void chaseCat(){ }


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("o nome do último cão é ");
        System.out.println(myDogs[2].name);

        int x = 0;

        while (x < myDogs.length){
            myDogs[x].bark();
            x++;
        }
    }
}