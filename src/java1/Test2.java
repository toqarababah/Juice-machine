package java1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// LOGICAL OPERATIONS
		/*
		 * int a = 5 ; int b =6 ; int x =20 ; boolean result=a>b && b>10 ;
		 * System.out.println(result); System.out.println(a<b || a>b ); result=!(a>b &&
		 * b>10);
		 */
		// END

		// INPUT/OUTPUT
		/*
		 * System.out.println("please insert your number : "); Scanner input = new
		 * Scanner(System.in); int x = input.nextInt(); System.out.println("even:" + (x
		 * % 2 == 0)); System.out.println("odd:" + (x % 2 != 0));
		 */
		// END

		// IF ELSE
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("please enter two number"); int num1 = input.nextInt();
		 * int num2 = input.nextInt(); if (num2 != num1 ) { System.out.println("start");
		 * System.out.println("num2 greater than num1");
		 * 
		 * }
		 * 
		 * System.out.println("End");
		 */
		// END
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("come in"); int x
		 * =input.nextInt();
		 * 
		 * if ( x % 2 == 0) { System.out.println("even"); System.out.println("ok"); }
		 * else System.out.println("odd");
		 */

		/*
		 * Scanner input = new Scanner(System.in); System.out.println("come in age ");
		 * int age = input.nextInt(); if (age >= 18 ) {
		 * System.out.println("entry allowed");
		 * 
		 * } else System.out.println("entry is not allowed");
		 */

		// END

		/*
		 * Scanner input = new Scanner(System.in); System.out.println("come in number");
		 * int num = input.nextInt(); if ((num > 100)&&(num <1000 )) {
		 * System.out.println("Positive and +100 "); } if (num > 1000) {
		 * System.out.println(" positive and + 1000 "); }
		 */

		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("come in Average"); int average = input.nextInt(); if
		 * (average > 90) { System.out.println("Excellant"); } if ((average >
		 * 80)&&(average < 90)) { System.out.println("Very good"); } else
		 * System.out.println("Good");
		 */

		/*
		 * String str1 ="HELLO"; String str2 ="hello"; String str3 = str1.toLowerCase();
		 * System.out.println(str3);
		 * 
		 * String str4=str2.toUpperCase(); System.out.println(str4);
		 * 
		 * char letter =str1.charAt(0); System.out.println(letter);
		 * 
		 * int index=str2.indexOf('h'); System.out.println(index);
		 * 
		 * if (str1.equals(str2)) { System.out.println("equal"); } else {
		 * System.out.println("not equal");}
		 * 
		 */
         // END 
	    
		//NESTED IF - ALLOW USER TO INSERT WORD 3 TIMES
		/*	Scanner input = new Scanner(System.in);
			System.out.println("Enter a word");
			String word = input.next();
			if (word.charAt(0) == 'a' || (word.charAt(0) == 'A')) {
				System.out.println("It's done");
			} else {
				System.out.println("Enter again");
				word = input.next();
				if (word.charAt(0) == 'a' || (word.charAt(0) == 'A')) {
					System.out.println("It's done");
				} else {
					System.out.println("Enter again");
					word = input.next();
					if (word.charAt(0) == 'a' || (word.charAt(0) == 'A')) {
						System.out.println("It's done");
					} else {
						System.out.println("You can't try");

					}

				}

			}  */
			   
			// END 
			
	}

}
