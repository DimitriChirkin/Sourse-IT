package HomeWork12;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class HomeWork11_12 {
	public static void main(String[] args) throws IOException {

		Shop shop = new Shop();
		List<Ware> myWare = shop.getWare();
		shop.helloBuyer();
		Scanner sc = new Scanner(System.in);
		String shopCommand = new String();
		
		do {
			shopCommand = sc.nextLine();
			
			switch (shopCommand) {
			case "add":
					addWareInConsole();
					myWare = shop.getWare();
				break;

			case "print":
					printWareInConsole(myWare);
				break;
				
			case "put":

				break;
			case "buy":
					System.out.println("�� ��������� �������");
				break;
			case "help":
					shop.helpBuyer();
				break;
			case "exit":
					System.out.println("�� ��������, ���������� �� ������� � ������ ��������");
				break;
			default:
				break;
			}
			
		} while (shopCommand.equals("exit") == false);
		
		sc.close();
	}
	
	static void printWareInConsole(List<Ware> myWare) {
	
		System.out.print("|");
		System.out.printf("%5s", "Id |");
		System.out.printf("%20s", " �������� |");
		System.out.printf("%10s", " ��� |");
		System.out.printf("%25s", " ������ |");
		System.out.printf("%10s", " ���� |");
		System.out.printf("%10s", " ���-�� |");
		System.out.println();
		for (Ware ware2 : myWare) {
			System.out.print("|");
			System.out.printf("%5s", ware2.getId() + " |");
			System.out.printf("%20s", ware2.getName()  + "|");
			System.out.printf("%10s", ware2.getWeight()  + " �� |");
			System.out.printf("%25s", ware2.getDimHeight() + 
					"x" + ware2.getDimWidth() + "x" + ware2.getDimDepth() + " �� |");
			System.out.printf("%10s", ware2.getPrice() + " $ |");
			System.out.printf("%10s", ware2.getQuantity() + "|");
			System.out.println();
		}

	}
	
	static void addWareInConsole () throws IOException {
		Shop shop = new Shop();
		Scanner scWare = new Scanner(System.in);
		String newWare = new String();
		System.out.println("��� ���������� ������ ������� ���: ��������, ���, ������, ������, �������, ���-��, ����. ��� ������� ����� ; � ���� ������.");
		newWare = scWare.nextLine();
		String[] newFild = newWare.split(";");
		if (newFild.length == 7) {
			shop.addWare(newWare);
		} else {
			System.out.println("����� �� ��������, �� �� ����� ��� ����������� ����");
		}
		//scWare.close();
	}
	
}
