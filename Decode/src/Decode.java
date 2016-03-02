import java.util.Scanner;
public class Decode {
public static void main(String[] args) {
		
		String text1,text2;
		char x;
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Text : ");
		text1=scan.nextLine();
		text2=text1.toUpperCase();
		
		for(i=text2.length()-1;i>=0;i--)
		{
			x=text2.charAt(i);
			
			if(x=='E'){
				x='R';
			}
			else if(x=='R'){
				x='W';
			}
			else if(x=='W'){
				x='E';
			}
			System.out.print(x);
		}
	}
}