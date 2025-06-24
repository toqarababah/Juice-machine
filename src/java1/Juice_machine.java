package java1;

import java.util.Scanner;

public class Juice_machine {

	public static String name(int juiceName) {

		switch (juiceName) {
		case 1:
			return "عصير برتقال";

		case 2:
			return "عصير تفاح";

		case 3:
			return "صير رمان";

		}

		return "";
	}

	public static double price(int juiceNumber) {

		switch (juiceNumber) {
		case 1:
			return 0.50;

		case 2:
			return 0.75;

		case 3:
			return 1.00;
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("     مرحباً بكم في آلة بيع العصائر");

		System.out.println("1" + "- " + " عصير برتقال " + " ( 0,50 دينار )");

		System.out.println("2" + "- " + " عصير تفاح " + " (0,75 دينار )");

		System.out.println("3" + "- " + " عصير رمان " + " ( 1,0 دينار )");

		System.out.println("     ادخل رقم العصير :");

		int choice = scanner.nextInt();

		double juiceNumber = price(choice);
		String juiceName = name(choice);

		// juiceNumber= price = 0 ;

		System.out.println("    (ادخل المبلغ النقدي ( بالدينار :");

		double userMoney = scanner.nextDouble();

		if (userMoney >= juiceNumber) {

			double remine = userMoney - juiceNumber;
			System.out.println(" تم شراء " + juiceName + " بنجاح . الباقي  :" + remine);
		} else {
			System.out.println(" المبلغ غير كافي لشراء " + juiceName);
		}

		scanner.close();

	}

}
