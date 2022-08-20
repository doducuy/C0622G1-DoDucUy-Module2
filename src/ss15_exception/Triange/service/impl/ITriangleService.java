package ss15_exception.Triange.service.impl;

import ss15_exception.Triange.model.Triangle;
import ss15_exception.Triange.service.ITriangle;
import ss15_exception.Triange.service.util.Exceptionnhapcanhngu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITriangleService implements ITriangle {
    Scanner scanner= new Scanner(System.in);
    private static List<Triangle> triangles = new ArrayList<>();

    public ITriangleService() {
    }

    @Override
    public void addABC() {
        Triangle triangle= getABC();
        triangles.add(triangle);
    }

    @Override
    public void displayABC() {
        for (int i = 0; i <triangles.size() ; i++) {
            System.out.println(triangles.get(i).toString());
        }
    }
    public Triangle getABC(){
        Triangle triangle;

        while(true){
            try{
                System.out.println("nhap a");
                double a= Double.parseDouble(scanner.nextLine());
                System.out.println("nhap b");
                double b =Double.parseDouble(scanner.nextLine());
                System.out.println("nhap c");
                double c = Double.parseDouble(scanner.nextLine());
                if(a<=0|| b<=0|| c<=0||a+b<=c||a+c<=b||b+c<=a){
                    throw new Exceptionnhapcanhngu("nhap canh ngu");
                }
                 triangle=new Triangle(a,b,c);
                break;
            }catch (Exceptionnhapcanhngu e){
                System.out.println(e.getMessage());
            }
        }
        return triangle;
    }

}
