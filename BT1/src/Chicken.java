package BT1.src;
public class Chicken extends Animal implements Swimable{

    @Override
    public String swim() {
        return "Chicken can swim";
    }

    @Override
    public String makesound() {
        return "Chicken make sound like cluck-cluck";
    }
    
}
