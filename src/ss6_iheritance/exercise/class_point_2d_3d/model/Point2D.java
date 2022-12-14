package ss6_iheritance.exercise.class_point_2d_3d.model;

import java.util.Arrays;

public class Point2D {
    private float x= 0.0f;
    private float y= 0.0f;
    private float[]arr= new float[2];
    public Point2D(){
    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        this.arr= new float[]{getX(), getY()};
        return arr;
    }
    public void setXY(float x, float y){
        this.arr= new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point2D: " +
                "x=" + x +
                ", y=" + y + ", arr=" + Arrays.toString(getXY());
    }
}
