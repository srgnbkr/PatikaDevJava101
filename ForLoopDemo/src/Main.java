import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number,total =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		number = input.nextInt();
		
		for(int i = 0; i<=number ; i++) {
			if(i%12==0) {
				total = i +total;
			}
			
		}
		System.out.println(total);

	}

}
