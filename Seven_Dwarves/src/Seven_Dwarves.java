import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		
		int Dwarf_1,Dwarf_2,Dwarf_3;
		int Dwarf_4,Dwarf_5,Dwarf_6,Dwarf_7;
		int Dwarf_8,Dwarf_9;
		
		
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter Dwarf_1 : ");
		
		Dwarf_1 = scan.nextInt();
			System.out.print("Enter Dwarf_2 : ");
		
		Dwarf_2 = scan.nextInt();
			System.out.print("Enter Dwarf_3 : ");
		
		Dwarf_3 = scan.nextInt();
			System.out.print("Enter Dwarf_4 : ");
		
		Dwarf_4 = scan.nextInt();
			System.out.print("Enter Dwarf_5 : ");
		
		Dwarf_5 = scan.nextInt();
			System.out.print("Enter Dwarf_6 : ");
		
		Dwarf_6 = scan.nextInt();
			System.out.print("Enter Dwarf_7 : ");
			
		Dwarf_7 = scan.nextInt();
			System.out.print("Enter Dwarf_8 : ");
			
		Dwarf_8 = scan.nextInt();
			System.out.print("Enter Dwarf_9 : ");
		Dwarf_9 = scan.nextInt();
		
		
		System.out.println();
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_2");
		
			
		if(Dwarf_2+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_3");
		
		
		if(Dwarf_3+Dwarf_2+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_4");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_2+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_5");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_2+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_6");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_2+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_7");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_2+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_2 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_1 & Dwarf_9");
		
		
		if(Dwarf_1+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_3");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_4");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_1+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_5");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_1+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_6");
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_7");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_1+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_1 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_2 & Dwarf_9");
		
		
		if(Dwarf_3+Dwarf_2+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_4");
		
		
		if(Dwarf_1+Dwarf_4+Dwarf_2+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_5");
		
		
		if(Dwarf_1+Dwarf_4+Dwarf_5+Dwarf_2+Dwarf_7+Dwarf_8+Dwarf_9 ==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_6");
		
		
		if(Dwarf_1+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_2+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_7");
		
		if(Dwarf_1+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_2+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_8");
		
		if(Dwarf_1+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_3 & Dwarf_9");
		
		if(Dwarf_3+Dwarf_1+Dwarf_2+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_4 & Dwarf_5");
		
		
		if(Dwarf_3+Dwarf_1+Dwarf_5+Dwarf_2+Dwarf_7+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_4 & Dwarf_6");
		
		
		if(Dwarf_3+Dwarf_1+Dwarf_5+Dwarf_6+Dwarf_2+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_4 & Dwarf_7");
		
		
		if(Dwarf_3+Dwarf_1+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_2+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_4 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_1+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_4 & Dwarf_9");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_1+Dwarf_2+Dwarf_7+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_5 & Dwarf_6");
		

		if(Dwarf_3+Dwarf_4+Dwarf_1+Dwarf_6+Dwarf_2+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_5 & Dwarf_7");
		
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_1+Dwarf_6+Dwarf_7+Dwarf_2+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_5 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_1+Dwarf_6+Dwarf_7+Dwarf_8+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_5 & Dwarf_9");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_1+Dwarf_2+Dwarf_8+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_6 & Dwarf_7");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_1+Dwarf_7+Dwarf_2+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_6 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_1+Dwarf_7+Dwarf_8+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_6 & Dwarf_9");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_1+Dwarf_2+Dwarf_9==100)
			System.out.print("Incorrect Dwarf is Dwarf_7 & Dwarf_8");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_1+Dwarf_8+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_7 & Dwarf_9");
		
		
		if(Dwarf_3+Dwarf_4+Dwarf_5+Dwarf_6+Dwarf_7+Dwarf_1+Dwarf_2==100)
			System.out.print("Incorrect Dwarf is Dwarf_8 & Dwarf_9");
		
		

	}

}
