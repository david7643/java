import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Circle{
     private double x,y;
     private int radius;
     public Circle(double x,double y, int radius){
     this.x=x;
     this.y=y;
     this.radius=radius;
}
public void show(){
       System.out.println("("+x+","+y+")"+radius);
}
}
class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Circle c[]= new Circle[3];
    for(int i=0;i<c.length;i++){
        System.out.print("x,t,radius>>");
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        int radius=scan.nextInt();
        c[i]= new Circle(x,y,radius);
    }
    for(int i=0;i<c.length;i++){
       c[i].show();
    }

    }
}