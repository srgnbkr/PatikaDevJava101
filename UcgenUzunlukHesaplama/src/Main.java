import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		fieldCalculate();
		hypotenuseCalculate(14, 48);
		

	}
	public static void fieldCalculate() {
		double a,b,c,field,perimeter,u;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Birinci Kenar:");
		a = input.nextDouble();
		
		System.out.println("İkinci Kenar:");
		b = input.nextDouble();
		
		System.out.println("Üçüncü Kenar:");
		c = input.nextDouble();
		
		u = (a + b + c) /2;
		perimeter = 2 * u;
		field = Math.sqrt((u) * (u - a) * (u - b) * (u - c));
		
		System.out.println("Üçgenin Çevresi :"+perimeter);
		System.out.println("Üçgenin Alanı : "+field);

	}
	public static void hypotenuseCalculate(int a,int b) {
		
		double hypotenuse;
		
		hypotenuse = Math.sqrt((a * a)+(b * b));
		System.out.println("Üçgenin Hipotenüsü : "+hypotenuse);
		
	}

}
