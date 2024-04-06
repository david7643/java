package david0429;
import java.util.Scanner;
public class Helloworld {
	public static void main(String[] args){
	System.out.print("원화를 입력하세요(단위 원)>> ");
	Scanner scanner = new Scanner (System.in);
	int a = scanner.nextInt();
	double c = a/1100;
	System.out.println(a + "원은 " + "$" + c + "입니다.");
	}
}