package nhap.nhap.giaiptbac2;

public class giaipt {
    double a;
    double b;
    double c;
    double delta;
    public giaipt(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        delta= b*b-4*a*c;
    }
    public String getSolution( ){
        if(delta==0){
            return " pt co 2 nghiem bang nhau: "+ -b/(2*a);
        }else if(delta>0){
            return "pt co 2 nghiem phan biet: "+ (-b+ Math.sqrt(delta))/(2*a)+"\n"+ (-b- Math.sqrt(delta))/(2*a);
        }else{
            return "pt vo nghiem";
        }
    }

}
