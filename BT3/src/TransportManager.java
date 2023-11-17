package BT3.src;
import BT3.src.Ship;
import BT3.src.Airplane;
import BT3.src.Truck;
public class TransportManager implements Transportable{
    public TransportManager() {};
    @Override
    public String displayInfo() {
        return getInfo();
    }
    
    
}
