import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
       String password;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Şifrenizi Giriniz: ");
       password = input.next();
       
       if(password.equals("12345")) {
    	   System.out.println("Giriş Başarılı");
       }else {
    	   System.out.println("Şifre Yanlış Sıfırlamak İçin 1  Yeniden Giriş Yapmak İçin 2'yi Seçin");
    	   int result = input.nextInt();
    	   switch(result){
    	   case 1:
    		   System.out.println("Yeni Şifre");
    		   String newPassword = input.next();
    		   if(newPassword.equals("12345") || newPassword.equals(password)) {
    			   System.out.println("Önceki Şifrelerden Birini Girdiniz");
    		   }else {
    			   System.out.println("Şifre Oluşturuldu: "+newPassword);
    			   newPassword = password;
    		   }
    		   break;
    	   case 2:
    		   System.out.println("Yeniden Giriş Yapınız:");
    		   break;
    		   default:
    			   System.out.println("Geçersiz Seçim");
    	   
    	   
    	   }
       }
    }


	
		
		
}
		
		
		
				
		
			
		
		
		
		

	


