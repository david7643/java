package ch_java;

class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	public int Resolution;
	ColorTV(int size,int Resolution){
		super(size);
		this.Resolution=Resolution;
	}
	public void printproperty(){
		System.out.print(getSize()+"인치 "+Resolution+"컬러");
	}
}
class IPTV extends ColorTV{
	String adress; 
	IPTV(String adress,int size,int Resolution){
		super(size,Resolution);
		this.adress = adress;
		}
	public void printproperty(){
		System.out.print("나의 IPTV는"+adress+"주소의"+getSize()+"인치"+Resolution+"컬러");
	}
}
public class Extends{
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printproperty();
	}
}
