import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		priceCalculate();

	}
	
	public static void priceCalculate() {
		double km,price,kmPrice = 2.20,fixedPrice = 20;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat decimalFormat  = new DecimalFormat("###,###.00");
		
		System.out.println("Yapılan Km");
		km = input.nextDouble();
		
		price = (km * kmPrice) + 10;
		
		if(price<=20) {
			System.out.println("Ücret: "+decimalFormat.format(fixedPrice)+" TL");
		}else {
			System.out.println("Ücret: "+decimalFormat.format(price)+" TL");
			
		}
		
	}

}
