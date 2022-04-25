package game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PlayGame pg = new PlayGame(new Picachu());
//		PlayGame pg = new PlayGame(new Gobook());
//		PlayGame pg = new PlayGame(new Lee());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("=======캐릭터성장프로그램=====");
		System.out.println("=========================");
		
		System.out.println("캐릭터를 선택하세요. 1.피카츄 2.꼬북이 3.이상해씨");
		int a = sc.nextInt();
		Character character = null;
		switch(a)
		{
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Gobook();
			break;
		case 3:
			character = new Lee();
			break;
		default:
			System.out.println("캐릭터를 올바르게(1~3) 선택하세요.");
		}
		PlayGame pg;
		if (character == null)
		{
			System.out.println("게임을 종료합니다.");
			return;
		}
		else
		{ 
			pg = new PlayGame(character);
		}
		
		while(true)
		{
			pg.printMenu(sc);
			if (pg.isExit() == true)
			{
				break;
			}
		}
	}

}
class PlayGame
{
	private Character character;
	private int menu;
	private boolean exit;
	
	public PlayGame(Character character)
	{
		this.character = character;
	}
	public void printMenu(Scanner sc)
	{
		System.out.println("1.밥먹이기 2.잠재우기 3.놀아주기 4.운동시키기 5.종료");
		menu = sc.nextInt();
		play();
	}
	public void play()
	{
		switch(menu)
		{
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			exit = character.play();
			break;
		case 4:
			exit = character.train();
			break;
		case 5:
			exit = true;
			break;
		}
		character.printInfo();
	}
	public boolean isExit()
	{
		return exit;
	}
	public Character getCharacter()
	{
		return character;
	}
	public void setCharacter(Character character)
	{
		this.character = character;
	}
	public int getMenu()
	{
		return menu;
	}
	public void setExit(boolean exit)
	{
		this.exit = exit;
	}
}
abstract class Character
{
	protected int hp;
	protected int level;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	public boolean checkEnergy()
	{
		boolean ret = false;
		if (energy <= 0)
		{
			ret = true;
		}
		else
		{
			ret = false;
		}
		return ret;
	}
	public void printInfo()
	{
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.print("hp = "+ hp+'/');
		System.out.print("energy = "+ energy+'/');
		System.out.println("level = "+ level);
	}
}
class Picachu extends Character
{
	Picachu()
	{
		hp = 30;
		energy = 50;
		System.out.println("피카츄가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy += 10;
	}
	public void sleep()
	{
		energy += 5;
	}
	public boolean play()
	{
		energy -= 20;
		hp += 5;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		
		energy -= 15;
		hp = hp + 20;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if ( hp >= 40)
		{
			level++;
			hp = hp - 40;
		}
	}
}
class Gobook extends Character
{
	Gobook()
	{
		hp = 40;
		energy = 50;
		System.out.println("꼬북이가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy += 15;
	}
	public void sleep()
	{
		energy += 10;
	}
	public boolean play()
	{
		energy -= 30;
		hp += 15;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		
		energy -= 20;
		hp = hp + 30;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if ( hp >= 50)
		{
			level++;
			hp = hp - 50;
		}
	}
}
class Lee extends Character
{
	Lee()
	{
		hp = 20;
		energy = 30;
		System.out.println("이상해씨가 생성되었습니다.");
		printInfo();
	}
	public void eat()
	{
		energy += 5;
	}
	public void sleep()
	{
		energy += 20;
	}
	public boolean play()
	{
		energy -= 10;
		hp += 15;
		levelUp();
		return checkEnergy();
	}
	public boolean train()
	{
		
		energy -= 10;
		hp = hp + 20;
		levelUp();
		return checkEnergy();
	}
	public void levelUp()
	{
		if ( hp >= 35)
		{
			level++;
			hp = hp - 35;
		}
	}
}