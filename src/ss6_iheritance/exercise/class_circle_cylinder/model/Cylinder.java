package ss6_iheritance.exercise.class_circle_cylinder.model;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return super.toString()+", area= "+getArea()+ ", volume= "+getVolume();
    }
}
