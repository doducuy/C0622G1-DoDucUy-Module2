package ss6_iheritance.exercise.point_moveablepoint.model;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;
    private float[]arr= new float[2];

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint() {
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        this.arr= new float[]{getXSpeed(),getYSpeed()};
        return arr;
    }
    public  MoveablePoint move(){
          super.setX(super.getX()+xSpeed);
          super.setY(super.getY()+xSpeed);
          return this;
    }

    @Override
    public String toString() {
        return super.toString()+
                " MoveablePoint" +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed ;
    }
}
