
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;//객체선언
		p1 = new Product();//힙영역에 Product크기만큼 메모리 할당.
		p1.num = 1;
		p1.name = "노트북";
		
		System.out.println("객체 p1의 정보출력");
		System.out.println("p1.num = "+p1.num);
		System.out.println("p1.name = "+p1.name);
		
		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";
		
		System.out.println("객체 p2의 정보출력");
		System.out.println("p2.num = "+p2.num);
		System.out.println("p2.name = "+p2.name);
	}

}
class Product
{
	int num;//제품번호
	String name;//제품명
	
}