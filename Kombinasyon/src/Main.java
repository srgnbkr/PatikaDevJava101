import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int varNumber1,varNumber2,total1=1,total2=1,total3=1;;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci Sayıyı Giriniz: ");
		varNumber1 = input.nextInt();
		
		for (int i= 1 ; i <= varNumber1; i++) {
			
			total1 = total1 * i;
		}
		
		System.out.println("İkinci Sayıyı Giriniz: ");
		varNumber2 = input.nextInt();
		
		for (int i= 1 ; i <= varNumber2; i++) {
			
			total2 = total2 * i;
		}
		
		for(int i = 1 ; i <= varNumber1-varNumber2; i++) {
			total3 = total3 * i;
		}
		
		int result = (total1) / (total2 *total3);
		
		System.out.println("Kombinasyon Hesaplandı: "+result);
		

	}

}
