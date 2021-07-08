import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		vatCalculate();

	}
	public static void vatCalculate() {
		double price,vatIncluded,vatAmount,vat=0.18,newVat=0.08;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
		
		System.out.println("Tutarı Giriniz: ");
		price = input.nextDouble();
		
		if(price <=1000) {
			vatAmount = price * vat;
			vatIncluded = price + vatAmount;
			
			System.out.println("Ürünün Tutarı :"+decimalFormat.format(price)+" TL");
			System.out.println("Ürünün Kdv Tutarı :"+decimalFormat.format(vatAmount)+" TL");
			System.out.println("Ürünü Kdvli Tutarı :"+decimalFormat.format(vatIncluded)+" TL");
			System.out.println("Kdv Oranı :"+(vat));
		}else {
			
			vatAmount = price * newVat;
			vatIncluded = price + vatAmount;
			
			System.out.println("Ürünün Tutarı :"+decimalFormat.format(price)+" TL");
			System.out.println("Ürünün Kdv Tutarı :"+decimalFormat.format(vatAmount)+" TL");
			System.out.println("Ürünü Kdvli Tutarı :"+decimalFormat.format(vatIncluded)+" TL");
			System.out.println("Kdv Oranı :"+(newVat));
			
		}
		
		
		
	}
	
	

}
