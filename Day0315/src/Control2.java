import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int gender = sc.nextInt();
		//int gender = 2;//3, 4
		
		//gender�� 3�ΰ�� "����"�� ���
		//gender�� 4�ΰ�� "����"�� ���
		
		if ( gender == 2|gender == 4)
		{
			System.out.println("����");
		}
		else if ( gender == 1| gender == 3)
		{
			System.out.println("����");
		}
		else 
		{
			System.out.println("�߸��Է�");
		}
		
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		if ( score <= 100 & score >= 60)
		{
			System.out.println("�հ�");
		}
		else if ( score > 0 & score < 60)
		{
			System.out.println("���հ�");
		}
		else
		{
			System.out.println("�߸��Է�");
		}
		
		System.out.println("������ �Է��ϼ���");
		int score2 = sc.nextInt();
		
		if ( score2 >= 90)
		{
			System.out.println("��");
		}
		else if ( score2 >= 80)
		{
			System.out.println("��");
		}
		else if ( score2 >= 70)
		{
			System.out.println("��");
		}
		else 
		{
			System.out.println("��");
		}
		
			
	}

}