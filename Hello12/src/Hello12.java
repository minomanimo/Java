
public class Hello12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		//char c2 = c1+1// int로 형변환되어 불가능.
		char c3 = (char)(c1+1);
		System.out.println(c3);
		char c4 = ++c1;
		System.out.println(c4);
		int i = 'B'-'A';
		int j = '2'-'0';
		System.out.println(i);
		System.out.println(j);		
	}

}
