package pk04_2;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aVar='A';
		System.out.println("aVar : " + aVar);
		System.out.println("aVar : " +(int)aVar); 
		aVar = (char)((int)aVar+1);
		System.out.printf("aVar : %c \n", aVar);
		System.out.printf("aVar : %c", (char)(int)aVar+32);
	}

}
