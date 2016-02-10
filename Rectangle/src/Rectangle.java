import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		
		int Num1,Num2,Num3,Num4,i;
		
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Input Number1 : ");
				Num1=scan.nextInt();
				
			System.out.print("Input Number2 : ");
				Num2=scan.nextInt();
				
			System.out.print("Input Number3 : ");
				Num3=scan.nextInt();
				
			System.out.print("Input Number4 : ");
				Num4=scan.nextInt();
				
			if(Num1>Num2){
					
		i=Num1;
		Num1=Num2;
		Num2=i;
		
		}
			if(Num1>Num3){
					
		i=Num1;
		Num1=Num3;
		Num3=i;
		
		}
			if(Num1>Num4){
				
		i=Num1;
		Num1=Num4;
		Num4=i;
		
		}
				
			if(Num2>Num3){
			
		i=Num2;
		Num2=Num3;
		Num3=i;
		
		}
			
			if(Num2>Num4){
				
		i=Num2;
		Num2=Num4;
		Num4=i;
		
		}
			if(Num3>Num4){
				
		i=Num3;
		Num3=Num4;
		Num4=i;
		
		}
			
		System.out.print(" Rectangle Area = : "+" "+Num3+" "+" * "+Num1+ " = " + Num3 * Num1);

	}

}
