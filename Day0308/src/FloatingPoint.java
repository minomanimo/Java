
public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float y = 3.14f;
		
		System.out.println("y="+y);
		//printf() //형식화된 출력
		System.out.printf("floating-point:%.8f\n", y);//실수형,소수점 8자리까지//소수점 9째자리에서 반올림
		System.out.printf("floating-point:%020.8f\n" , y);//총 20자리, 소수점 아래 8자리까지 포함. 나며지는 0으로 채워줌
		System.out.printf("floating-point;%20.8f\n", y);//총 20자리, 소수점아래 8자리 포함.
		System.out.printf("floating-point:%8g\n", y);
		System.out.printf("floating-point:%8e\n", y);//지수표현으로
		
		//%d : 10진 정수를 출력(decimal)
		System.out.printf("%d \n", 10);
		System.out.printf("%o \n", 10);
		System.out.printf("%x \n", 10);
		System.out.printf("%b \n", true);
	}

}
