package ch_java;
import java.util.*;

class Month {
    private String work;

    public Month() {
        this.work = null;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void show(int date) {
        if (work == null) {
            System.out.println(date + "일에 할일이 없습니다.");
        } else {
            System.out.println(date + "일의 할일은 " + work + "입니다.");
        }
    }
}

class month_schedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Month[] schedule = new Month[30];
        for (int i = 0; i < 30; i++) {
            schedule[i] = new Month();
        }

        while (true) {
            System.out.println("오늘 스케쥴 관리 프로그램.");
            System.out.println("할일(입력:1, 보기:2, 끝내기:3)>>");
            int a = scan.nextInt();

            if (a == 1) {
                System.out.println("날짜(1~30)>>");
                int date = scan.nextInt();
                if (date >= 1 && date <= 30) {
                    System.out.println("할일>>");
                    String work = scan.next();
                    schedule[date - 1].setWork(work);
                } else {
                    System.out.println("다시 입력하시오.(1~30)");
                }
            } else if (a == 2) {
                System.out.println("날짜(1~30)>>");
                int date = scan.nextInt();
                if (date >= 1 && date <= 30) {
                    schedule[date - 1].show(date);
                } else {
                    System.out.println("다시 입력하시오.(1~30)");
                }
            } else if (a == 3) {
                System.out.println("프로그램 종료.");
                break;
            } else {
                System.out.println("다시 입력하십시오.");
            }
        }
        scan.close();
    }
}
