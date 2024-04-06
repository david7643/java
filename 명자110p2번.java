package david0429;
import java.util.Scanner;
public class Helloworld {
	public static void main(String[] args){
		System.out.print("2자리수 정수 입력(10~99)>>");
	    Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	    if(a/10 == a%10)
	    	System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
	    else
	    	return;
	}
}