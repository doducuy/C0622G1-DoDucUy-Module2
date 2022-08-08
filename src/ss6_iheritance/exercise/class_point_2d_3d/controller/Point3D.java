package ss6_iheritance.exercise.class_point_2d_3d.controller;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] arr = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        this.arr = new float[]{getX(), getY(), z};
        return arr;
    }
    public void setXYZ(float x, float y,float z){
        this.arr= new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D:" +
                "x= "+getX()+
                " y= "+getY()+
                " z=" + z +
                ", arr=" + Arrays.toString(getXYZ()) ;
    }
}
