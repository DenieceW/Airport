import java.util.ArrayList;

public class PlaneList {
    ArrayList<Plane> list;

    public PlaneList(){
        this.list = new ArrayList<Plane>();
    }

    public void addPlaneToList(Plane plane){
        this.list.add(plane);
    }

    public void printPlaneList(){
        for (Plane plane : this.list){
            System.out.println(plane);
        }
    }

    public Plane getPlane(String input){
        for(Plane plane: this.list) {
            if (plane.getPlaneID().contains(input)) {
                return plane;
            }
        }
        return null;
    }

    public void printPlane(String input){
        for(Plane plane: this.list) {
            if (plane.getPlaneID().contains(input)) {
                System.out.println(plane);
            }
        }
    }
}
