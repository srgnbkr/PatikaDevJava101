import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number,total=0,varNumber,newTotal = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		number = input.nextInt();
		
		for(int i = 1; i<=number ; i++) {
			if(i%12==0) {
				System.out.println(i);
				varNumber = number / 12;
				total = (i +total);
				newTotal = total / varNumber;
				
				
			}
			
		}
		System.out.println("3'e Ve 4'e Bölünen tam sayıların toplamını :"+total);
		System.out.println("3'e Ve 4'e Bölünen tam sayıların toplamının ortalaması :"+newTotal);
		

	}

}
