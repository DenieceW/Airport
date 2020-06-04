import java.util.Scanner;

public class Plane {
    private String planeID;
    private int planeCapacity;

    public Plane(String planeID, int planeCapacity){
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }
    public Plane(String planeID){
        this.planeID = planeID;
        this.planeCapacity = getPlaneCapacity();
    }

    public String getPlaneID(){
        return this.planeID;
    }

    public int getPlaneCapacity(){
        return this.planeCapacity;
    }

    public String toString(){
        return this.planeID + " (" + this.planeCapacity + " ppl)";
    }
}
