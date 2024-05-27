package ch_java;
import java.util.*;
abstract class Converter{ 
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다.");
		System.out.println(getSrcString()+"을 입력하세요>> ");
		double val  = scan.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: "+res+getDestString()+"입니다.");
		scan.close();
	}
}
class Won2Dollar extends Converter{
	Scanner scan = new Scanner(System.in); 
	double Dollar;
	Won2Dollar(int Dollar){
		this.Dollar=Dollar;
	}
	protected double convert(double src) {
		return src/Dollar;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
}
class Km2Mile extends Converter{
	Scanner scan = new  Scanner(System.in);
	double Mile;
	Km2Mile(double Mile){
		this.Mile = Mile;
	}
	protected double convert(double src) {
		return src/Mile;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "Mile";
	}
}
public class java315p_3 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
