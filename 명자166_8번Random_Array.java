package ch_java;
import java.util.*;
public class Random_Array {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int Array[];
	while(true) {
		System.out.println("정수 몇개?>>");
		int a =scan.nextInt();
		if(a<=100) {
			Array = new int[a];
			break;
		}
		else {
			System.out.println("다시입력하십시오.>>");
			continue;
		}
		}
	for(int i=0;i<Array.length;i++) {
		int b = scan.nextInt();
		Array[i] = b;
	}
	for(int j=0;j<Array.length;j++) {
		System.out.print(Array[j]+" ");
	}
	}
}
