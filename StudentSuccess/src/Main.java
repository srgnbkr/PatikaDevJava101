import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		classPass();
		
		}
	
	
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		if (point > 0 && point <= 100) {
            return point;
        } else {
            return 0;
        }
	}
	
	public static void classPass() {
		
		int math,music,turkish,chemistry,physics;
		
		System.out.println("Matematik Notu : ");
		math = input();
		
		System.out.println("Müzik Notu : ");
		music = input();
		
		System.out.println("Türkçe Notu : ");
		turkish = input();
		
		System.out.println("Kimya Notu : ");
		chemistry = input();
		
		System.out.println("Fizik Notu : ");
		physics = input();
		
		int result = (math + music + turkish + chemistry +physics) / 5;
		
		if(result >= 55) {
			System.out.println("Sınıfı Geçtiniz Notunuz: "+result);
		}else {
			System.out.println("Sınıfta Kaldınız Notunu : "+result);
		}
		
		
	}
		

	}


