package BT1.src;
public class Dog extends Animal implements Swimable{

    @Override
    public String swim() {
        
        return "Dog can swim";
    }

    @Override
    public String makesound() {
        return "Dog barks gau gau";
    }
    
}
