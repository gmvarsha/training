package client;
import java.util.*;
public class App {
	private Scanner sc;
	public App()
	{
		sc=new Scanner(System.in);
	}
	public void mainMenu()
	{
		
		System.out.println("1.Admin Menu");
		System.out.println("2.User Menu ");
		System.out.println("3. Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
					AdminMenu admin=new AdminMenu();
					admin.menu();
					break;
		case 2:
					UserMenu user=new UserMenu();
					user.menu();
					break;
		case 3:
					System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		
		App aobj=new App();
		aobj.mainMenu();
		
	}
}
