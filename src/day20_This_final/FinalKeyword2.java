package day20_This_final;

public class FinalKeyword2 {

	final int speedlimit;// blank final variable
	
	FinalKeyword2() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println(f1.speedlimit); 
	}
}
