package ch_java;
import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class day{
    String work;
    public void day(String work){this.work=work;}
    public String get(){return work;}
    public void show(){
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}
class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       day schedule = new day();
        for(;;){
        System.out.println("오늘 스케쥴 관리 프로그램.");
        System.out.println("할일(입력:1, 보기:2, 끝내기:3)>>");
        int a = scan.nextInt();
        if(a==1){
        	System.out.println("할일(빈칸없이 입력)>>");
            String work = scan.next();
            schedule.work=work;
            continue;
        }
        else if(a==2){
                schedule.show();
                continue;
        }
        else if(a==3){
            System.out.print("프로그램 종료.");
            break;
        }
            else{
            System.out.print("다시 입력하십시오.");
            continue;
        }
    }
        scan.close();
    }
}
