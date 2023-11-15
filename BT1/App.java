package BT1;
import BT1.src.Animal;
import BT1.src.Chicken;
import BT1.src.Dog;
import BT1.src.Swimable;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makesound());
            if(animal instanceof Dog){
                Swimable swimming = (Dog) animal;
                System.out.println(swimming.swim());
            }
            if(animal instanceof Chicken){
                Swimable swimming = (Chicken) animal;
                System.out.println(swimming.swim());
            }
        }
    
    }
}
