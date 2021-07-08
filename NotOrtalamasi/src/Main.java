import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double math,physics,chemistry,history,turkish,music,result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz : ");
		math = input.nextDouble();
		
		System.out.println("Fizik Notunuz : ");
		physics = input.nextDouble();
		
		System.out.println("Kimya Notunuz : ");
		chemistry = input.nextDouble();
		
		System.out.println("Tarih Notunuz : ");
		history = input.nextDouble();
		
		System.out.println("Türkçe Notunuz : ");
		turkish = input.nextDouble();
		
		System.out.println("Müzik Notunuz : ");
		music = input.nextDouble();
		
		result = (history + music + chemistry + math + physics + turkish) / 6 ;
		
		System.out.println("Not Ortalamanız :"+result);
		System.out.println(result>=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
		
		
	

	}
	

}
