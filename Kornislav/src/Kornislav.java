import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		
		int G1=1,G2=0,G3=0,t1,i;
		String swap;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Value : ");
		swap = scan.next();
		
		for(i=0;i<swap.length();i++){
			if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		t1=G1;
		G1=G2;
		G2=t1;
		}
			else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		t1=G2;
		G2=G3;
		G3=t1;
		}
			else{
		t1=G1;
		G1=G3;
		G3=t1;
		
		}
			}
		
			if(G1 == 1) System.out.println("Coin is in LEFT Glass!! ");
				else if(G2 == 1) System.out.println("Coin is in CENTER Glass!! ");
					else System.out.println("Coin is in RIGHT Glass!! ");

	}

}
