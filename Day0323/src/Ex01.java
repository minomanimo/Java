
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		int[] score = new int[5];
		for (i = 0; i < 5; i++)
		{
			j = i * 10;
			score[i] = j;
		}
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
	}

}
