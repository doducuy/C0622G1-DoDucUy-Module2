package nhap.home;

public class Ptbh {
    double delta;
    double nghiem1;
    double nghiem2;
    int a,b,c;
    public Ptbh(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDelta(){
        this.delta= b*b -4*a*c;
        return delta;
    }
    public double getNghiem1(){
        this.nghiem1 = (-b+Math.sqrt(delta))/(2*a);
        return nghiem1;
    }
    public double getNghiem2(){
        this.nghiem2 = (-b-Math.sqrt(delta))/(2*a);
        return nghiem2;
    }
}
