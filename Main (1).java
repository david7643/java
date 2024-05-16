import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class song{
    String title;
    String artist;
    String country;
    int year;
    song(){
    }
    song(String title,String artist,String country,int year){
        this.title=title;
        this.artist=artist;
        this.country=country;
        this.year=year;
    }
    void show(){
        System.out.println(year+"년"+country +"국적의 "+artist+"가 부른 "+title);
    }
    
}
class Main {
    public static void main(String[] args) {
    song res = new song("Dancing Queen","ABBA","스웨덴",1978);
        res.show();
    }
}