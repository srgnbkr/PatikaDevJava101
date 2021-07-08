import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		vkiCalculate();

	}
	
	public static void vkiCalculate() {
		double vki,weight,height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Boyunuzu Giriniz (Metre Cinsinde): ");
		height = input.nextDouble();
		System.out.println("Kilonuzu Giriniz (Kg): ");
		weight = input.nextDouble();
		
		vki = weight / (height * height);
		
		System.out.println("Vücut Kitle Endeksiniz: "+vki);
		
		
		
	}

}
