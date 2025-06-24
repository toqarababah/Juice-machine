package java1;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Test {

	//private static char[] i;
	//private static int[][] num;

	//public static void main(String[] args) {
	//}}
	
		
		    
   
		  
/*	Scanner input = new Scanner(System.in);
	System.out.println("come in Average");
	 int average = input.nextInt();
	if (average >= 90 ) {
		System.out.println("Excellent");	
	}else if( average >= 75 ) {
		System.out.println("Very good");
	} else if (average >= 60) {
		System.out.println("Good");
	} else {
		System.out.println("Failed");
	} */
		
	
/*	String word ="Hello";
	int size = word.length();
	System.out.println(size);
	
	char c = word.charAt(4);
	System.out.println(c);
	
	boolean result =Character.isAlphabetic(c);
	System.out.println(result);
	
	boolean result2 =Character.isDigit(c);
	System.out.println(result2); 
	
	char c0 = word.charAt(0);
	boolean result3 =Character.isUpperCase(c0);
	
	System.out.println(result3);
	boolean result4 =Character.isLowerCase(c0);
	System.out.println(result4);  */
	  
	  
	
/*	Scanner input = new Scanner(System.in);
	System.out.println("Enter password");
	String password = input.next();
	 int length = password.length();
	 char c1 = password.charAt(0);
     boolean resultAlphabetic  =Character.isAlphabetic(c1);
	 
	 
	 char c7=password.charAt(7);
	 boolean resultDigit  =Character.isDigit(c7);
	 
	
	if(length == 8 && resultAlphabetic == true && resultDigit == true ) {
		System.out.println("Entered");
	} else {
		System.out.println("lncorrect password");
	} */
	
	
	/*	System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
	    int number = input.nextInt();
	    while (number!=15) {
	    	number = input.nextInt();
	    }
	    System.out.println("15---END");   */
	
	
	/*	System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
        for (int i =1 ; i<=50 ;i++) {
		System.out.println(i);
	}
	 System.out.println("50---END");   */
	
	
	/*	Scanner input = new Scanner(System.in);
		System.out.println("pragr...");
		String pra =input.next();
		int counter =0;
		for(int c=0 ;c<pra.length();c++) {
			char l=pra.charAt(c);
			if(Character.isDigit(l)) {
				counter++;
			}
		}
		System.out.println(counter); */
	
	  
		
		 /*Scanner input = new Scanner(System.in);
		System.out.println("Enter text");
		String text =input.next();
		while(true) {
		int counter =0;
		int counter1 =0;
		for(int c=0 ;c<text.length();c++) {
			char l=text.charAt(c);
			if (Character.isDigit(l)) {
				 counter++;
			}
		if(Character.isAlphabetic(l)) {
			counter1++;
		
		}
		
	  
		}
		
		
		if (counter1++>=5 && counter++ >=7 ) {
		   
			System.out.println("the entery is correct");
			break;
		} else {
			System.out.println("the entery is invalid");
			text =input.next();
			
		}
		}   */
	       
		
		
	/*	Scanner input = new Scanner(System.in);
		//String pro =input.next();
		
		int counter =input.nextInt();	;
		int sum=0;
		while (counter!=0) {
			counter=input.nextInt();			
				sum=sum+counter;
			}
		System.out.println(sum); */
		
		
		
	/*	 Scanner input = new Scanner(System.in);
		System.out.println("Enter word");
		String word =input.next();
		 int length = word.length();
		 for ( int i=length-1; i>=0;i--) {
			 char c  =word.charAt(i) ;
			 
				System.out.print(c); */
	 //ARRAGS 1 
	/*	 int ages[] = {10,20,30,40,50};
		 int l=ages.length;
		 for (int i=0 ;i<  l;i++) {
			 System.out.println( ages[i]);
			 
		 }
		 System.out.println(" enter your marks");
		 Scanner input = new Scanner(System.in);
		 int marks[] = new int[6];
		 for(int i=0;i<marks.length;i++){
		     marks[i]=input.nextInt();
		 } 
		 int sum=0 ;
		 for(int i=0;i<marks.length;i++) {
			 sum=sum+marks[i];
		 }
		 
		 System.out.println("Sum ="+sum);
	     double avg=sum/marks.length;
		 System.out.println("avg="+avg); */
	//END ARRAGS 1
	
	/*	 int ages[] = {10,20,30,40,50};
		 int l=ages.length;
		 for (int i=0 ;i<  l;i++) {
			 System.out.println( ages[i]);
			 
		 }
		 System.out.println(" enter your marks");
		 Scanner input = new Scanner(System.in);
		 int marks[] = new int[6];
		 for(int i=0;i<marks.length;i++){
		     marks[i]=input.nextInt();
		 } 
		 int gre=marks[0];
		 for(int i=1;i<marks.length;i++) {
			 if(marks[i]>gre) {
				 gre=marks[i];
			 }
			 
			 
		 }
		 
	
		 System.out.println(" max "+ gre); */
		 
	/*	 String word[] = {"welcom","to","collage"};
		 int l=word.length;
		 
		 for (int i=0;i<l;i++) {
			System.out.println( word[i]);
		 } */
	
	   
	
	
/*	int arr [][]= {
			
			{1,5,8},
			{4,7,9}	 
	};
	 int sum=0 ;
	for(int i=0 ; i<arr.length;i++) {
		for (int j=0 ; j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
			 sum=sum+arr[i][j];
			
		}
		
	}
	 
	 System.out.println("Sum ="+sum); */
    
	
	/*	 System.out.println("enter array"); 
		 Scanner input = new Scanner(System.in);
		int check [][]= new int [3][4];
		 
		for (int i=0 ; i<check.length;i++) {
			for (int j=0 ; j<check[i].length;j++) {
				check[i][j]=input.nextInt();
				if ( check [i][j] <=0) {
					 System.out.println("negative");
					
					 
				} if(check [i][j] >0) { 
						 System.out.println("positive"); 
					 }
			}
			 
			
			
		}  */
		//ادخال جملتين من 5 كلمات ويطبع ترو اذا وجد كلمه كفت   
	/*	Scanner input = new Scanner(System.in);
		String [] sentence1 = new String[5];
		String [] sentence2 = new String[5];
		System.out.println("Enter the first sentence:");
		for (int i = 0; i < 5; i++) { 
			sentence1[i] = input.next();
			}
		System.out.println("Enter the first sentence:");
		for(int i = 0; i < 5; i++) {
			sentence2[i] = input.next();
			} 
		for(int i = 0; i < 5; i++) {
			if (sentence1[i].equalsIgnoreCase("CAVT") || sentence2[i].equalsIgnoreCase("CAVT")) {
				System.out.println(true);
				break; 
		}
		} */
		
		
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int numStudents = input.nextInt();
		double[] marks = new double[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Enter student mark " + (i + 1) + ": ");
			marks[i] = input.nextDouble(); 
			}
		for (int i = 0; i < numStudents; i++) {
			System.out.print("student number" + (i + 1) + ": ");
			if (marks[i] > 90) { System.out.println("A");
			} else if (marks[i] > 80) {
				System.out.println("B");
			} else { System.out.println("C");
			  } 
			} input.close(); */
		
	






/*public static int maxNum( int num[]) {

int maxNum = num[1];

for(int i=1; i < num.length; i++) {

if (num[i] > maxNum) {

maxNum = num[i];

}

}

return maxNum;

}

public static void main(String[] args) {

int[] num = { 99,8,7,9,1022,3,66,23 };

int maxNum = num[0];

System.out.println(" the max number:" + maxNum(num));

} */
	
	
/*	public static int[] switch_x_y(int x, int y) {

		int z = x;

		x = y;

		y=z;

		return new int[] {x,y};

		}

		public static void main(String[] args) {

		int x = 8;

		int y = 13;

		System.out.println("Before switching :");

		System.out.println("x = " +x +"\n"+ "y = " + y);

		int[] switchxy=switch_x_y(x,y);

		x = switchxy[0];

		y = switchxy[1];

		System.out.println(" switch :");

		System.out.println("x = " +x+"\n"+"y = " + y);
	
		} */
		


}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

	



