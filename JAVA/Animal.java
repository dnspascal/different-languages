public class Animal{
    public void animalSound(){
        System.out.println("The animal sounds like");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig sounds:WEE WEE");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog sounds: WOO WOO");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("The cow sounds: MOO MOO");
    }
}
class Goat extends Animal{
    public void animalSound(){
        System.out.println("The goat sounds:MEE MEE");
    }
}
class Bird extends Animal{
    public void animalSound(){
        System.out.println("The birds chirping");
    }
}
class MyMainClass{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal    myPig = new Pig();
        Animal  myDog = new Dog();
        Animal myCow = new Cow();
        Animal myGoat = new Goat();
        Animal myBird = new Bird();
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    myCow.animalSound();
    myGoat.animalSound();
    myBird.animalSound();
    }
}