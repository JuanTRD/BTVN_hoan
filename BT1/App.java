package BT1;
import BT1.src.Animal;
import BT1.src.Chicken;
import BT1.src.Dog;
import BT1.src.Swimable;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Dog dog = new Dog();
        animals[0] = dog;
        Chicken chicken = new Chicken();
        animals[1] = chicken;
        for(Animal animal : animals){
            System.out.println(animal.makesound());
            if(animal instanceof Swimmable){
                
                System.out.println(((Swimmable) animal).swim());
            }
            if(animal instanceof Chicken){
                Swimable swimming = (Chicken) animal;
                System.out.println(swimming.swim());
            }
        }
    
    }
}
