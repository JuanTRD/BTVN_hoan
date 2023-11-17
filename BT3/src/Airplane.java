package BT3.src;

public class Airplane extends Transport{

    public Airplane(double source, double destination, double time) {
        super(source, destination, time);
        
    }
    private final double COST = 40;
    private final double TIMECOST = 20;
    @Override
    public double calculateCost() {
        return COST * (this.destination - this.source);
    }
    public double calculateTimeCost(){
        return TIMECOST * this.time / 60;
    }
    public String getInfo(){
        return "Airplane: Source: " + this.source 
        + " Destination: " + this.destination 
        + " Distance: " + this.distance
        + " Time: " + this.time;
    }
}
