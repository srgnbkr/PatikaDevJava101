import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        
        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        
        System.out.print("Secimininizi giriniz: ");
        int secim = input.nextInt();
        
        switch(secim) {
        case 1:
            System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
            break;
        case 2:
            System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
            break;
        case 3:
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
            break;
        case 4:
            System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }

	}

}
