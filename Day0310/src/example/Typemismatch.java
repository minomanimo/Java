package example;

public class Typemismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 13;
		float c = 0;
		
		c = (float)(a+b)/2;
		System.out.println("a�� b�� ����� "+c+" �̴�");
		char c1 = 'A';
		System.out.println(c1);
		char c2 = (char)(c1+1);
		System.out.println(c2);
		byte d =(byte)128;
		System.out.println(d);
	}

}