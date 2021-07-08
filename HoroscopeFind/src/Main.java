import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		findHoroscope();

	}
	public static void findHoroscope() {
		Scanner input=new Scanner(System.in);
        int month,day;
        String burc = null;
        System.out.println("Burç Hesaplama");
        System.out.println("Lütfen ay giriniz(1 ile 12 arasında)=");
        month=input.nextInt();
        while(month<1||month>12){
        System.out.println("Lütfen ay giriniz(1 ile 12 arasında)=");
        month=input.nextInt();
        }
        System.out.println("Lütfen gün giriniz(1den 31e kadar)=");
        day=input.nextInt();
        while(day<1||month>31){
        System.out.println("Lütfen gün giriniz(1den 31e kadar)=");
        day=input.nextInt();
        }
        if(month==1){
            if(day<=19){burc="oğlak";}
            if(day>19){burc="kova";}
        }
        if(month==2){
            if(day<=18){burc="kova";}
            if(day>18){burc="balık";}
        }
        if(month==3){
            if(day<=19){burc="balık";}
            if(day>19){burc="koç";}
        }
        if(month==4){
            if(day<=19){burc="koç";}
            if(day>19){burc="boğa";}
        }
        if(month==5){
            if(day<=20){burc="boğa";}
            if(day>20){burc="ikizler";}
        }
        if(month==6){
            if(day<=21){burc="ikizler";}
            if(day>21){burc="yengeç";}
        }
        if(month==7){
            if(day<=22){burc="yengeç";}
            if(day>22){burc="aslan";}
        }
        if(month==8){
            if(day<=22){burc="aslan";}
            if(day>22){burc="başak";}
        }
        if(month==9){
            if(day<=22){burc="başak";}
            if(day>22){burc="terazi";}
        }
        if(month==10){
            if(day<=22){burc="terazi";}
            if(day>22){burc="akrep";}
        }
        if(month==11){
            if(day<=21){burc="akrep";}
            if(day>21){burc="yay";}
        }
        if(month==12){
            if(day<=21){burc="yay";}
            if(day>21){burc="oğlak";}
        }
        System.out.println("Burcunuz:"+burc);
		
		
		
		
		
		
	}

}
