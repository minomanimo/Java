package buy;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		for (int i = 0; i < 3; i++)
		{
			b.buy(p[i]);
		}
		b.print();
	}

}
class Product
{
	int price;
	int bonusPoint;
}

class TV extends Product
{
	int channel;
	int volume;
	TV()
	{
		price = 100;
		bonusPoint = 100;
	}
}
class Computer extends Product
{
	int cpu;
	int ram;
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
}
class Audio extends Product
{
	int volume;
	int speaker;
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}
class Buyer
{
	int money = 10000;
	int bonusPoint = 0;
	
	void buy(Product p)
	{
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
	
	void print()
	{
		System.out.println("money = "+ money);
		System.out.println("bonusPoint = "+ bonusPoint);
	}
}