import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int varNumber,total=0;
		
		
		
		while(true) {
			System.out.println("Bir Sayı Giriniz:");
			varNumber = input.nextInt();
			if(varNumber%2==1) break;
			if(varNumber%4==0) {
				total = varNumber + total;
			}
			
				
			
			
		}
		System.out.println("Toplamı :"+total);

	}

}
