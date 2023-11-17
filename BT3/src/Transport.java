package BT3.src;

public abstract class Transport{
    protected double source;
    protected double destination;
    protected double distance;
    protected double time;
    public Transport(double source, double destination,double time){
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.time = time;
    }
    public double getDistance(){
        return this.distance = this.destination - this.source;
    }
    public String getInfo(){
        return "Source: " + this.source 
        + " Destination: " + this.destination 
        + " Distance: " + this.distance
        + " Time: " + this.time;
    }
    public abstract double calculateCost();
    public abstract double calculateTimeCost();
}
