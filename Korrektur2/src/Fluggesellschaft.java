import java.io.Serializable;
import java.util.ArrayList;

public class Fluggesellschaft implements Serializable {
    private String name;
    public Fluggesellschaft(){}
    public Fluggesellschaft(String name){
        this.name=name;
    }
    public Object clone(){
        return new Fluggesellschaft(this.name);
    }
}
