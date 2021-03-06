package day25_Interface;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Interface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		Interface3 obj = new Interface3();
		obj.print();
		obj.show();
	}
}