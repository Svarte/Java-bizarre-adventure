package Labs.L6;

public class Ape extends Animal {
    private Object inArms;
    public void setInArms(Object inArms) {this.inArms = inArms;}
    public Object getInArms() {return inArms;}
    public void throwObject (Object inArms) {this.inArms = null;}
}
