import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r,a,pi = 3.14,field;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yarıçap: ");
		r = input.nextDouble();
		System.out.println("Açı :");
		a = input.nextDouble();
		
		if(a%360==0) {
			field = pi * (r * r);
			System.out.println("Dairenin Alanı : "+field);
		}else {
			field = pi * (r * r *(a%360) / 360) ;
			System.out.println("Dairenin Alanı : "+field);
		}
		
		
		
		
		
		
		
		

	}

}
