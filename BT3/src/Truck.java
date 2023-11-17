package BT3.src;

public class Truck extends Transport{
    
    public Truck(double source, double destination, double time){
        super(source, destination, time);
        
    }
    private final double COST = 15;
    private final double TIMECOST = 5;
    public double calculateCost(){
        return COST * (this.destination - this.source);
        
    }
    public double calculateTimeCost(){
        return TIMECOST * this.time / 60;
    }
    public String getInfo(){
        return "Truck: Source: " + this.source 
        + " Destination: " + this.destination 
        + " Distance: " + this.distance
        + " Time: " + this.time;
    }

}
