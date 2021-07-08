import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		priceCalculate();
		
		

	}
	
	public static void priceCalculate() {
			double pear =2.14;
			double apple = 3.67;
			double tomato = 1.11;
			double banana = 0.95;
			double eggplant = 5;
			
			double buyPaer,buyApple,buyTomato,buyBanana,buyEggplant,totalPrice;
			
			Scanner input = new Scanner(System.in);
			DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
			
			System.out.println("Armut :");
			buyPaer = input.nextDouble();
			
			System.out.println("Elma :");
			buyApple = input.nextDouble();
			
			System.out.println("Domates :");
			buyTomato = input.nextDouble();
			
			System.out.println("Muz :");
			buyBanana = input.nextDouble();
			
			System.out.println("Patlıcan :");
			buyEggplant = input.nextDouble();
			
			totalPrice = (pear *buyPaer) 
					+ (apple * buyApple) 
					+ (tomato * buyTomato) 
					+ (banana * buyBanana) 
					+ (eggplant + buyEggplant);
			
			System.out.println("Toplam Tutar: "+decimalFormat.format(totalPrice)+" TL");
			
			
			
			
			
			
			
			
		
			
			
	}
	
	
	

}
