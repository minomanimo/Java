import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = sc.next().charAt(0);
		if (value >=97 && value <= 122)
		{
			System.out.println("대문자 : "+(char)(value-32));
		}
		else
		{
			System.out.println("잘못된 문자를 입력했습니다");
		}
		
	}

}
