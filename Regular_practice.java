package real자바;
import java.util.Scanner;
public class Regular_practice {
	public int width;
	public int height;
	public int getarea() {
		return width*height;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Regular_practice TabletPc = new Regular_practice();
		System.out.print("사각형의 길이:");
		TabletPc.width=scan.nextInt();
		System.out.print("사각형의 높이:");
		TabletPc.height=scan.nextInt();
		System.out.print("사각형의 넓이:"+TabletPc.getarea());
		}
	}
