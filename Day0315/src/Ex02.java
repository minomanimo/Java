import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int x = sc.nextInt();
		if (x%2 == 0)
		{
			System.out.println("¦���Դϴ�.");
		}
		else
		{
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		if (a < 0 )
		{
			System.out.println(a*-1);
		}
		else
		{
			System.out.println(a);
		}
		System.out.println("���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		int c = b*-1;
		int d = (b<0)?c:b;
		System.out.println(d);
	}

}
