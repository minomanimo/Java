
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;
		p1 = new Product();
		p1.num = 1;
		p1.name = "노트북";
		p1.print();
		
		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";
		p2.print();
		
		Product p3 = new Product();
		p3.num = 3;
		p3.name = "에어컨";
		p3.print();
	}

}
class Product
{
	int num;
	String name;
	void print()
	{
		System.out.println(num);
		System.out.println(name);
	}
}