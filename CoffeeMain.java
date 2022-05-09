import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Coffee> list = new ArrayList<Coffee>();
		CoffeeMenu cm = new CoffeeMenu(list);
		cm.menuProcess();
	}

}
class CoffeeMenu
{
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	ArrayList<Coffee> list;
	CoffeeMenu(ArrayList<Coffee> list)
	{
		this.list = list;
	}
	Coffee addCoffee()
	{
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("브랜드:");
		String brand = sc.next();
		
		sc.nextLine();
		
		System.out.print("가격:");
		String price = sc.nextLine();
		
		System.out.println("추가완료---"+ name + price + brand);
		return new Coffee(name, price, brand);
	}
	int search()
	{
		int idx = -1;
		Coffee c = null;
		
		System.out.print("하고자 하는 이름:");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++)
		{
			c = list.get(i);
			if(c.getName().equals(name))
			{
				idx = i;
				break;
			}
		}
		if (idx == -1)
		{
			System.out.println("검색결과 없음.");
		}
		else
		{
			System.out.println("검색결과");
			System.out.println(c);
		}
		return idx;
	}
	void setCoffee()
	{
		Coffee c = null;
		System.out.print("수정");
		int idx = search();
		if (idx >= 0)
		{
			c = list.get(idx);
			
			System.out.print("수정할 가격:");
			String price = sc.next();
			sc.nextLine();
			System.out.print("수정할 브랜드:");
			String brand = sc.nextLine();
			c.setBrand(brand);
			c.setPrice(price);
			System.out.println("수정완료.");
		}
		else
		{
			System.out.println("찾는 이름이 없습니다.");
		}
		
	}
	void delCoffee()
	{
		Coffee c = null;
		System.out.print("삭제");
		int idx = search();
		if (idx >= 0)
		{
			c = list.get(idx);
			list.remove(idx);
			System.out.println(c.getName() + "을(를) 삭제했습니다.");
		}
		else
		{
			System.out.println("찾는 이름이 없습니다.");
		}
	}
	void printAllCoffee(Iterator<Coffee> iter)
	{
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	void delAllCoffee()
	{
		list.removeAll(list);
		System.out.println("모든메뉴 삭제");
	}
	void menuProcess()
	{
		System.out.println("===============================");
		System.out.println("=========커피메뉴관리프로그램========");
		System.out.println("===============================");
		while (flag == true)
		{
			System.out.println("1. 추가 2. 검색 3. 수정 4. 삭제 5. 전체출력 6. 데이터 초기화 7. 종료");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				Coffee c = addCoffee();
				list.add(c);
				break;
			case 2:
				System.out.print("검색");
				search();
				break;
			case 3:
				setCoffee();
				break;
			case 4:
				delCoffee();
				break;
			case 5:
				if (list.size() == 0)
				{
					System.out.println("메뉴가 없습니다.");
					break;
				}
				Iterator<Coffee> iter = list.iterator();
				printAllCoffee(iter);
				break;
			case 6:
				delAllCoffee();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			}
		}
	}
}
class Coffee
{
	private String name;
	private String price;
	private String brand;
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	public Coffee(String name, String price, String brand)
	{
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	public Coffee()
	{
		
	}
	public String getName()
	{
		return this.name;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}