import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		int gender = sc.nextInt();
		//int gender = 2;//3, 4
		
		//gender가 3인경우 "남자"로 출력
		//gender가 4인경우 "여자"로 출력
		
		if ( gender == 2|gender == 4)
		{
			System.out.println("여자");
		}
		else if ( gender == 1| gender == 3)
		{
			System.out.println("남자");
		}
		else 
		{
			System.out.println("잘못입력");
		}
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		if ( score <= 100 & score >= 60)
		{
			System.out.println("합격");
		}
		else if ( score > 0 & score < 60)
		{
			System.out.println("불합격");
		}
		else
		{
			System.out.println("잘못입력");
		}
		
		System.out.println("점수를 입력하세요");
		int score2 = sc.nextInt();
		
		if ( score2 >= 90)
		{
			System.out.println("수");
		}
		else if ( score2 >= 80)
		{
			System.out.println("우");
		}
		else if ( score2 >= 70)
		{
			System.out.println("미");
		}
		else 
		{
			System.out.println("가");
		}
		
			
	}

}
