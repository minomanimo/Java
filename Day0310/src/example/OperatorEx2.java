package example;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		j=i++;
		System.out.println("j=i++; 실행 후, i=" + i +", j="+j);
		
		i=5;
		j=0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);	
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);//byte+byte->int+int=int
		System.out.println(c);
	}

}
